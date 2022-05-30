package br.com.dio.banco;


public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        Banco lista = new Banco();

       cliente.setNome("Juliana");
       cliente2.setNome("Raquel");
       cliente3.setNome("Rodolfo");


        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupança(cliente);
        Conta cc2 = new ContaCorrente(cliente2);
        Conta cc3 = new ContaCorrente(cliente3);



        cc.deposita(100d);
        cc.transferir(50d, poupanca);
        cc2.deposita(500);
        cc3.deposita(1000);

        System.out.println(" ----- Banco Digital -----");
       cc.imprimirExtrato();
       poupanca.imprimirExtrato();
       cc2.imprimirExtrato();
       cc3.imprimirExtrato();
       lista.listaClientes();
    }
}
