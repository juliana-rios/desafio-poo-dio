package br.com.cursoEmVideo;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[4];

        p[0] = new Pessoa("Juliana", 23, "F");
        p[1] = new Pessoa("Raquel", 51,"F");

        l[0] = new Livro("Quem pensa enquice", "Napoleon Hill", 360, p[0]);
        l[1] = new Livro("Bruxaria natural", "Arin Murphi", 252, p[0]);
        l[2] = new Livro("7 habitos altamentes eficases", "Covey", 460, p[1]);
        l[3] = new Livro("Técnicas de magia natural","Scott Cunningham", 250, p[0]);

    }
}
