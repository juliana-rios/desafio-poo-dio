package br.com.dio.banco;

public interface IConta {
     void sacar(double valor);
     void deposita(double valor);
     void transferir(double valor, Conta contaDestino);
     void imprimirExtrato();
}
