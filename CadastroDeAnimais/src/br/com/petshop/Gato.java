package br.com.petshop;

public class Gato extends Animal {
    private String corPelo;

    public Gato(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    public void miar() {
        System.out.println(getNome() + " está miando!");
    }

    public void exibirInfo() {
        System.out.println("\nGato");
        super.exibirInfo();
        System.out.println("Cor do pelo: " + corPelo);
        miar();
    }
}