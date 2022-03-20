package br.com.lista;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class HoraDoSistema {
    public static void main(String[] args) {
        //Mostrar data
        Date relogio = new Date();
        System.out.println("A hora é: ");
        System.out.println(relogio.toString());

        //Mostrar idioma
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é: ");
        System.out.println(loc.getDisplayLanguage());

       //Mostrar resolução da tela
        Toolkit tk= Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução da tela é: " + d.width + " X " + d.height);
    }
}
