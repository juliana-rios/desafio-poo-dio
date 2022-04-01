import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variaveis
        double valor;
        int parcelas;

       //Solicitação de dados ao usuario
        System.out.println("Digite o valor do emprestimo: ");
        valor = scan.nextDouble();
        System.out.println("Digite o número de parcelas: ");
        parcelas = scan.nextInt();

        calcular( valor, parcelas);
    }
    public static double taxaDuasParcelas(){
        return 0.3;
    }
    public static double taxaTresParcelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas){
        if (parcelas == 2){
            double valorFinal = valor + (valor * taxaDuasParcelas());
            System.out.println("O valor final para duas parcelas é: " + valorFinal);
        }
        else if (parcelas == 3){
            double valorFinal = valor + (valor * taxaTresParcelas());
            System.out.println("O valor final para três parcelas é: " + valorFinal);
        }else {
            System.out.println("Número de parcelas inválido!!");
        }
    }


}
