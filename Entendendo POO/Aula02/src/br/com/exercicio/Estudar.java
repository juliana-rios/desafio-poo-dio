package br.com.exercicio;

public class Estudar {
    int duracao;
    String disciplina;
    String meio;

    void lerconteudo(){
        System.out.println("lendo conteudo!!");
    }

    void anotar(){
        System.out.println("Anotando conteudo!!");
    }

    void praticar(){
        System.out.println("Realizando exercicio!");
    }

    void status(){
        System.out.println("\nDuração da aula: " + this.duracao + " horas");
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Meio de estudo: " + this.meio);
    }
}
