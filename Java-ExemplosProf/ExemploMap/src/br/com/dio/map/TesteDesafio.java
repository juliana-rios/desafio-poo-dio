package br.com.dio.map;

import java.util.Scanner;

public class TesteDesafio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float input;
        float quantCoxinha;
        float media;
        System.out.println("Digite o número de participantes: ");
        input = scan.nextInt();
        System.out.println("Digite a quantidade de coxinhas consumidas: ");
        quantCoxinha = scan.nextInt();

        media = (quantCoxinha / input);
    }
}
