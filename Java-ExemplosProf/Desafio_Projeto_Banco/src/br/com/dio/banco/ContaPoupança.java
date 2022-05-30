package br.com.dio.banco;

public class ContaPoupança extends Conta {

    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\nImprimir extrato conta poupança: ");
        super.imprimirInfoComuns();
    }

}
