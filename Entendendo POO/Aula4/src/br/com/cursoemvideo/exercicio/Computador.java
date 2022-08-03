package br.com.cursoemvideo.exercicio;

public class Computador {

    private String modelo;
    private String ram;
    private String placaMae;
    private String hd;
    private String processador;

    public Computador(String modelo, String ram, String placaMae, String hd, String processador) {
        this.modelo = modelo;
        this.ram = ram;
        this.placaMae = placaMae;
        this.hd = hd;
        this.processador = processador;
        this.ligar();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void ligar(){
        if (ram == null || placaMae == null || processador == null || this.hd == null){
            System.out.println("Não é possivel ligar o PC, pois falta componentes!!");
        }else {
            System.out.println("Ligando o computador!!");
        }
    }
   public void desligar(){
        System.out.println("Desligando!!");
    }

   public void listaComponetes(){
        System.out.println("\nModelo: " + this.getModelo());
        System.out.println("Placa mãe: " + this.getPlacaMae());
        System.out.println("Memória ram: " + this.getRam());
        System.out.println("HD: " + this.getHd());
        System.out.println("Processador: " + this.getProcessador());

    }
}
