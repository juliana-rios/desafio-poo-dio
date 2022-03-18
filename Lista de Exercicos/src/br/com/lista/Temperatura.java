package br.com.lista;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float graus, total;

        System.out.println("Digite quantos graus está fazendo: ");
        graus = scan.nextFloat();

        total = (graus * 9/5) + 32;

        System.out.println("A temperatura em Farenheit é: " + total);
    }
}
