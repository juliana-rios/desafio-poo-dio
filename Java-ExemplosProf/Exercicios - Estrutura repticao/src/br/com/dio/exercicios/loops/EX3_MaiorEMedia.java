package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class EX3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int contador  = 0;
        do {
            System.out.println("Digite um numéro: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if (numero > maior) maior = numero;

            contador = contador +1;
        } while(contador < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + soma/5);
    }
}

