package br.com.dio.exercicios.array;

import java.util.Scanner;

public class EX2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int caunt = 0;
        do{
            System.out.print("Letra: ");
            String letra = scan.next();

            if (! (letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i")|
                    letra.equalsIgnoreCase("o")|
                    letra.equalsIgnoreCase("u"))){

                consoantes[caunt] = letra;
                quantidadeConsoantes++;
            }
            caunt++;
        }while (caunt < consoantes.length);

        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.print("\nQuantidade consoantes: " + quantidadeConsoantes);
        System.out.print("\n"+ consoantes.length);
    }
}
