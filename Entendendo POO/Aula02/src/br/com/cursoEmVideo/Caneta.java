package br.com.cursoEmVideo;

public class Caneta {

  public  String modelo;
  public  String cor;
  private  float ponta;
  protected int carga;
  protected boolean tampada;

   public void tampar(){
        this.tampada = true;
    }
   public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO!! Caneta tampada");
        }else {
            System.out.println("Rabiscando!! ");
        }
    }
   public void destampar(){
        this.tampada = false;
    }
   public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga : " + this.carga + "%");
        System.out.println("Caneta está tampada? " + this.tampada);
    }
}
