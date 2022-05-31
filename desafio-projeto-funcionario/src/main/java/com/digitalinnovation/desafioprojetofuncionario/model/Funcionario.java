package com.digitalinnovation.desafioprojetofuncionario.model;

import javax.persistence.*;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @ManyToOne
    private EnderecoFuncio endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnderecoFuncio getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoFuncio endereco) {
        this.endereco = endereco;
    }
}
