package com.digitalinnovation.desafioprojetofuncionario.sevice.implement;


import com.digitalinnovation.desafioprojetofuncionario.model.EnderecoFuncio;
import com.digitalinnovation.desafioprojetofuncionario.model.EnderecoFuncioRepository;
import com.digitalinnovation.desafioprojetofuncionario.model.Funcionario;
import com.digitalinnovation.desafioprojetofuncionario.model.FuncionarioRepository;
import com.digitalinnovation.desafioprojetofuncionario.sevice.CepService;
import com.digitalinnovation.desafioprojetofuncionario.sevice.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FuncionarioImple implements FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private EnderecoFuncioRepository enderecoFuncioRepository;
    @Autowired
    private CepService viaCepService;
    @Override
    public Iterable<Funcionario> buscarTodos() {
        return funcionarioRepository.findAll();
    }

    @Override
    public Funcionario buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Funcionario funcionario) {
        CepFuncionario(funcionario);
    }

    @Override
    public void atualizar(Long id, Funcionario funcionario) {
        Optional<Funcionario> funcionarioBd = funcionarioRepository.findById(id);
        if (funcionarioBd.isPresent()) {
            CepFuncionario(funcionario);
        }
    }

    @Override
    public void deletar(Long id) {
        funcionarioRepository.deleteById(id);
    }

    private void CepFuncionario(Funcionario funcionario) {
        String cep = funcionario.getEndereco().getCep();
        EnderecoFuncio enderecoFuncio = enderecoFuncioRepository.findById(cep).orElseGet(() -> {
            EnderecoFuncio enderecoFuncio1 = viaCepService.consultarCep(cep);
            enderecoFuncioRepository.save(enderecoFuncio1);
            return enderecoFuncio1;
        });
        funcionario.setEndereco(enderecoFuncio);
        // Inserir Cliente, vinculando o Endereco (novo ou existente).
        funcionarioRepository.save(funcionario);
    }
}
