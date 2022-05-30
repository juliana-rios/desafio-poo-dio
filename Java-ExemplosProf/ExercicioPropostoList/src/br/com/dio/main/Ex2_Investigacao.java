package br.com.dio.main;

import java.util.*;

public class Ex2_Investigacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        System.out.println(" --- Perguntas ---");
        System.out.print("\nTelefonou para a vitima? ");
        String resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("\nEsteve no local do crime? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("\nMora perto da vitima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("\nDevia pra vitima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("\nJá trabalhou com a vitima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("\n" + respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()) {
            String resp = contador.next();
            if (resp.contains("s")) {
                count++;
            }
        }
        switch(count) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }
    }
}
