package br.com.exercicio;

public class Computador {
    String modelo;
    String placaMae;
    String marca;
    String memoriaRam;
    String hd;
    String processador;

    void ligar(){
        if (memoriaRam == null || placaMae == null || processador == null || this.hd == null){
            System.out.println("Não é possivel ligar o PC, pois falta componentes!!");
        }else {
            System.out.println("Ligando o computador!!");
        }
    }
    void desligar(){
        System.out.println("Desligando!!");
    }

    void listaComponetes(){
        System.out.println("\nModelo: " + this.modelo);
        System.out.println("Placa mãe: " + this.placaMae);
        System.out.println("Memória ram: " + this.memoriaRam);
        System.out.println("HD: " + this.hd);
        System.out.println("Processador: " + this.processador);

    }
}
