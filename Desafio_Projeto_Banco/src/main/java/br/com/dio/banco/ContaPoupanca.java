package br.com.dio.banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\nImprimir extrato conta poupança: ");
        super.imprimirInfoComuns();
    }

}
