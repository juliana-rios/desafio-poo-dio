package br.com.dio.banco;

import java.util.List;

public class Banco extends Cliente{
    protected List<Conta> contas;
    private String nome;



    public Banco() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }
    
    
    public void listaClientes(){
        for (Conta cont: this.contas) {
            System.out.println("\n" + " " + cont);
        }

    }
}
