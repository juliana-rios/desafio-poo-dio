package one.digitalinnovation.desafiodeprojetoLivraria.service.impl;

import one.digitalinnovation.desafiodeprojetoLivraria.model.Livraria;
import one.digitalinnovation.desafiodeprojetoLivraria.model.LivrariaRepository;
import one.digitalinnovation.desafiodeprojetoLivraria.model.Livro;
import one.digitalinnovation.desafiodeprojetoLivraria.model.LivroRepository;
import one.digitalinnovation.desafiodeprojetoLivraria.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class LivroServiceImpl implements LivroService {

    @Autowired
    private LivrariaRepository livrariaRepository;

    @Autowired
    private LivroRepository livroRepository;


    @Override
    public Iterable<Livro> buscarTodos() {
        return livroRepository.findAll();
    }

    @Override
    public Livro buscarPorId(Long id) {
        Optional<Livro> livro = livroRepository.findById(id);
        return livro.get();
    }

    @Override
    public void inserir(Livro livro) {

    }

    @Override
    public void atualizar(Long id, Livro livro) {

    }

    @Override
    public void deletar(Long id) {

    }


    private void salvarLivroId(Livraria livraria) {
        // Verificar se o Endereco do Cliente já existe (pelo CEP).
        Long id = livraria.getLivro().getId();
        Livro livro = livroRepository.findById(id).orElseGet(() -> {
            // Caso não exista, integrar com o ViaCEP e persistir o retorno.
            return livraria;
        });
        cliente.setEndereco(endereco);
        // Inserir Cliente, vinculando o Endereco (novo ou existente).
        clienteRepository.save(cliente);
}
