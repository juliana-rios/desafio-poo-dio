package br.com.cursoVideo;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade,
                   float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
       this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(peso<52.2) {
            categoria = "Peso abaixo do permitido!!";
        }else if (peso <= 70.3) {
            categoria = "Leve";
        }else if (peso<= 83.9){
            categoria = "Médio";
        }else if (peso <=120.2){
            categoria = "Pesado";
        }else {
            System.out.println("Peso inválido!");
        }
        }


    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("--------------------------------");
        System.out.println("Apresentando Lutador");
        System.out.println("Nome Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Altura: " + getAltura() + " m");
        System.out.println("Peso: " + this.getPeso() + " kg");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitorias: " + getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("-------------------------------------");
    }

    public void status(){
        System.out.print(this.getNome());
        System.out.print(" é um Peso " + this.getCategoria());
        System.out.print(" com " + this.getVitorias() + " vitorias, ");
        System.out.print( + this.getDerrotas() + " derrotas ");
        System.out.print("e " + this.getEmpates() + " empates.\n");

    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }
}
