package br.com.banco;

public class Main {
    public static void main(String[] args) {
        ContaBanco cli1 = new ContaBanco();

        cli1.abrirConta("CC");
        cli1.setNumConta(1);
        cli1.setDono("Creuza");
        cli1.depositar(500);
        cli1.sacar(100);
        cli1.mostrarCliente();

        ContaBanco cli2 = new ContaBanco();

        cli2.abrirConta("CP");
        cli2.setNumConta(2);
        cli2.setDono("Jubileu");
        cli2.depositar(300);
        cli2.mostrarCliente();
    }
}
