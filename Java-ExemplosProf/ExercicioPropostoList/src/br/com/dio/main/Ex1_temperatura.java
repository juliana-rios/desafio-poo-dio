package br.com.dio.main;

import java.util.*;


public class Ex1_temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperatura = new ArrayList<>();

        int count = 0;
        while (count <= 6){

            System.out.println("Digite a temperatura: ");
            double temp = scan.nextByte();
            temperatura.add(temp);
            count++;
        }

        System.out.println("Temperaturas: ");
        temperatura.forEach(t -> System.out.print(t + " "));

        double media = temperatura.stream()
                .mapToDouble(Double:: doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMédia temperaturas: %.1f\n", media);

        System.out.println("\nTemperaturas acima da média: ");
            temperatura.stream()
                    .filter(t -> t > media)
                    .forEach(t -> System.out.printf("%.1f ", t));

        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperatura.iterator();


        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();

            if (temp > media){
                switch (count){
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n ", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n ", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n ", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n ", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n ", temp);
                        break;
                }
            }
            count++;
        }
    }
}
