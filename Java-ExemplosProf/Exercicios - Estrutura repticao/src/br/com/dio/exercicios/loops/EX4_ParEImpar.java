package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class EX4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        int count= 0; //contador para contar os numeros a serem digitados

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero %2 == 0) quantPares++; // quantPares = quantPare + 1; Opção completa
            else quantImpares++;

            //count = count + 1; opção inteira do ingremento para contar cada vez que o laço se repetir
            count++; //opção simplificada
        } while (count < quantNumeros);

        System.out.println("Quantidade pares: " + quantPares);
        System.out.println("\nQuantidade impares: " + quantImpares);
    }

}
