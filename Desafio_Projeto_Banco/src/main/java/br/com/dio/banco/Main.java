package br.com.dio.banco;


public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cliente lista = new Cliente();


        cliente.setNome("Juliana");


        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);
        Conta lista1 = new Banco(lista);
        Emprestimo dispoValor = new Emprestimo();


        cc.deposita(100d);
        cc.transferir(50d, poupanca);


        System.out.println(" ----- Banco Digital -----");
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


        System.out.println(" \n----- Emprestimo -----");
        dispoValor.disponibilizarSaldo(cc, 300);
        System.out.println("Emprestimo realizado com sucesso! Confira o extrato: ");
        cc.imprimirExtrato();

        System.out.println("\n --- Área adm Banco ---");
        lista1.listaCont();
    }
}
