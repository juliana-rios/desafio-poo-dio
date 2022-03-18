package br.com.lista;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2, n3;
        int media;

        System.out.println("Digite a primeira nota: ");
        n1 = scan.nextInt();
        System.out.println("Digite a segunda nota: ");
        n2 = scan.nextInt();
        System.out.println("Digite a terceira nota: ");
        n3 = scan.nextInt();

        media = (n1+n2+n3) / 3;
        System.out.println("A média das notas é: " + media);
    }
}
