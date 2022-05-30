package br.com.dio.banco;

public class Emprestimo extends Conta{



    protected void disponibilizarSaldo(Conta contaFinal, double valorEmprestimo){
        contaFinal.deposita(valorEmprestimo);
    }
    @Override
    public void imprimirExtrato() {


    }


}
