package br.com.lista;

import java.util.Scanner;

public class MediaNotasIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float n1,n2,n3,n4;
        float media;

        System.out.println("Digite a primeira nota: ");
        n1 = scan.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = scan.nextFloat();
        System.out.println("Digite a terceira nota: ");
        n3 = scan.nextFloat();
        System.out.println("Digite a quarta nota: ");
        n4 = scan.nextFloat();
        media = (n1+n2+n3+n4)/4;

        System.out.println("Sua nota final é: " + media);

        if (media >= 7){
            System.out.println("Parabéns! Você passou!!");
        }else {
            System.out.println("Você está reprovado!! ");
        }
    }
}
