package br.com.exercicio;

public class Main {
    public static void main(String[] args) {
        Computador pc1 = new Computador();

        pc1.hd = "SSD";
        pc1.memoriaRam = "Hyperx";
        pc1.processador = "Intel I5";
        pc1.listaComponetes();
        pc1.ligar();

        Computador pc2 = new Computador();
        pc2.hd = "SSD";
        pc2.memoriaRam = "Hyperx";
        pc2.processador = "Intel I5";
        pc2.placaMae = "Qualquer modelo";
        pc2.listaComponetes();
        pc2.ligar();

        Estudar estudo1 = new Estudar();
        estudo1.duracao = 5;
        estudo1.disciplina = "lógica";
        estudo1.meio = "Com notebook";
        estudo1.status();
        estudo1.anotar();

    }
}
