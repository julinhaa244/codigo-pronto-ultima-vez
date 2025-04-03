package br.com.petshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    private ArrayList<Animal> animais;
    private Scanner scanner;

    public Cadastro() {
        animais = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void cadastrarCachorro() {
        System.out.print("Nome do cachorro: ");
        String nomeCachorro = scanner.nextLine();
        System.out.print("Tamanho do cachorro: ");
        int tamanhoCachorro = scanner.nextInt();
        System.out.print("Idade do cachorro: ");
        int idadeCachorro = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Raça do cachorro: ");
        String raca = scanner.nextLine();
        animais.add(new Cachorro(nomeCachorro, idadeCachorro, tamanhoCachorro, raca));
        System.out.println("Cachorro cadastrado com sucesso!");
    }

    public void cadastrarGato() {
        System.out.print("Nome do gato: ");
        String nomeGato = scanner.nextLine();
        System.out.print("Tamanho do gato: ");
        int tamanhoGato = scanner.nextInt();
        System.out.print("Idade do gato: ");
        int idadeGato = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Cor do pelo do gato: ");
        String corPelo = scanner.nextLine();
        animais.add(new Gato(nomeGato, idadeGato, tamanhoGato, corPelo));
        System.out.println("Gato cadastrado com sucesso!");
    }

    public void cadastrarHamster() {
        System.out.print("Nome do hamster: ");
        String nomeHamster = scanner.nextLine();
        System.out.print("Tamanho do hamster: ");
        int tamanhoHamster = scanner.nextInt();
        System.out.print("Idade do hamster: ");
        int idadeHamster = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Cor do pelo do hamster: ");
        String corRaca = scanner.nextLine();
        animais.add(new Hamster(nomeHamster, idadeHamster, tamanhoHamster, corRaca));
        System.out.println("Hamster cadastrado com sucesso!");
    }

    public void exibirAnimais() {
        System.out.println("\n=== Lista de Animais ===");
        for (Animal animal : animais) {
            animal.exibirInfo();
            System.out.println("------------------------");
        }
    }

    public void fecharScanner() {
        scanner.close();
    }
}
