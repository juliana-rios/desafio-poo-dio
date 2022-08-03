package br.com.cursoEmVideo;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void tampar(){
        this.tampada = true;
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO!! Caneta tampada");
        }else {
            System.out.println("Rabiscando!! ");
        }
    }
    void destampar(){
        this.tampada = false;
    }
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga : " + this.carga + "%");
        System.out.println("Caneta está tampada? " + this.tampada);
    }
}
