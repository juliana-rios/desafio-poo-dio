package br.com.lista;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int baseB, alturaH, total;

        System.out.println("Digite a base do triangulo: ");
        baseB = scan.nextInt();
        System.out.println("Digite a altura do triangulo: ");
        alturaH = scan.nextInt();

        total = (baseB * alturaH) / 2;
        System.out.println("A área do triangulo é: " + total);
    }

}
