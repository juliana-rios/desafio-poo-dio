package com.digitalinnovation.desafioprojetofuncionario.sevice;

import com.digitalinnovation.desafioprojetofuncionario.model.Funcionario;

public interface FuncionarioService {

    Iterable<Funcionario> buscarTodos();

    Funcionario buscarPorId(Long id);

    void inserir(Funcionario cliente);

    void atualizar(Long id, Funcionario funcionario);

    void deletar(Long id);
}
