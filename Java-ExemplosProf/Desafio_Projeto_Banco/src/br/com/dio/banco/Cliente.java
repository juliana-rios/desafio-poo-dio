package br.com.dio.banco;



public class Cliente {
    private String nome;
    private String endereco;



    public Cliente() {
        super();
    }


    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
