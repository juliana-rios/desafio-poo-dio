package br.com.lista;
import java.util.Scanner;

public class NumPrimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        String produto;
        int resul;

        System.out.println("Digite o primeiro valor: ");
        num1 = scan.nextByte();
        System.out.println("Digite o segundo número: ");
        num2 = scan.nextByte();
        System.out.println("Digite o nome do produto: ");
        produto = scan.next();
        resul = num1 + num2;

        System.out.println("A soma dos números é: " + resul);
        System.out.println("O produto é: " + produto);
    }


}
