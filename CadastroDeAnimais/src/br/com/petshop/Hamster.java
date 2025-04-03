package br.com.petshop;

public class Hamster extends Animal {
    private String raca;

    public Hamster(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public void correr() {
        System.out.println(getNome() + " está correndo na roda!");
    }

    public void exibirInfo() {
        System.out.println("\nHamster");
        super.exibirInfo();
        System.out.println("Raça: " + raca);
        correr();
    }
}