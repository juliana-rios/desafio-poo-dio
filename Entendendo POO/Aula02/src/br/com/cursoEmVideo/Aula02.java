package br.com.cursoEmVideo;

public class Aula02 {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.carga = 50;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        System.out.println("\n");

        Caneta c2 = new Caneta();
        c2.modelo = "Faber";
        c2.cor = "Vermelho";
        c2.carga = 70;
        //c2.ponta = 0.5f;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
