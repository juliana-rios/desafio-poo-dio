import java.util.Calendar;
import java.util.Date;

public class MensagemAdequada {
    public static void main(String[] args) {
        Calendar calen = Calendar.getInstance();
        int hora = calen.get(Calendar.HOUR_OF_DAY);

        if (hora > 6 && hora < 12){
            System.out.println("Bom dia!!");
        }else if (hora >12 && hora <18){
            System.out.println("Boa tarde!!");
        }else {
            System.out.println("Boa noite!!");
        }
    }
}
