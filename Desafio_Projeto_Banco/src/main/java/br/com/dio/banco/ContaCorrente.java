package br.com.dio.banco;

import static java.lang.String.format;

public class ContaCorrente extends Conta{


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Imprimir extrato conta corrente: ");
        super.imprimirInfoComuns();

    }


}
