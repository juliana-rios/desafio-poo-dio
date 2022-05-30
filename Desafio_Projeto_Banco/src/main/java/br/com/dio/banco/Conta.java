package br.com.dio.banco;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.format;

@Getter

public abstract class Conta implements IConta {
    List<Integer> lista = new ArrayList<Integer>();
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1 ;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;

    }

    public Conta() {

    }

    @Override
    public void sacar(double valor) {
        // forma simplificada saldo -= valor;
        this.saldo = saldo - valor;
    }

    @Override
    public void deposita(double valor) {
        // forma simplificada saldo += valor;
        this.saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.deposita(valor);
    }

    protected void imprimirInfoComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));

    }


    protected void listaCont() {
        lista.add(conta);
        System.out.println("Quantidade de contas: " + lista.size());

    }




}
