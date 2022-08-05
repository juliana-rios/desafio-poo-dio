package br.com.dio.desafio;

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Curso para iniciantes em Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de C#");
        curso2.setDescricao("Curso para iniciantes em C#");
        curso2.setCargaHoraria(7);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso de Python");
        curso3.setDescricao("Curso para iniciantes em python");
        curso3.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Primeiros passos Java");
        mentoria1.setDescricao("Mentoria para te orientar como começar a programar.");
        mentoria1.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Juliana");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        System.out.println("Conteudos inscritos Juliana: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos Juliana: " + dev1.getConteudosConcluidos());
        System.out.println("------------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Marcelo");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos inscritos Marcelo: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos Marcelo: " + dev2.getConteudosConcluidos());
        System.out.println("------------------------------------------------");

    }
}
