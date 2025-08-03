package NivelIntermediario.desafios.desafio6;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class SistemaNinja {

    private LinkedList<Ninja> ninjasLinkedList;
    private Scanner scanner;

    public SistemaNinja(LinkedList<Ninja> ninjasLinkedList, Scanner scanner) {
        this.ninjasLinkedList = ninjasLinkedList;
        this.scanner = scanner;
    }

    public LinkedList<Ninja> getNinjasLinkedList() {
        return ninjasLinkedList;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void inicializarNinjas() {
        ninjasLinkedList.add(new Ninja("Uzumaki Naruto", 17, "Konoha"));
        ninjasLinkedList.add(new Ninja("Uchiha Sasuke", 18, "Konoha"));
        ninjasLinkedList.add(new Ninja("Haruno Sakura", 18, "Konoha"));
        ninjasLinkedList.add(new Ninja("Hatake Kakashi", 34, "Konoha"));
        ninjasLinkedList.add(new Ninja("Gaara", 20, "Suna"));
        ninjasLinkedList.add(new Ninja("Kankuro", 20, "Suna"));
        ninjasLinkedList.add(new Ninja("Temari", 20, "Suna"));
    }

    public void exibirNinjas() {
        for (Ninja nome : ninjasLinkedList) {
            System.out.println("-" + nome);
        }
    }

    public void removerPrimeiroNinja() {
        if (ninjasLinkedList.isEmpty()) {
            System.out.println("Lista vazia, nenhum ninja para remover.");
        } else {
            Ninja ninjaRemovido = ninjasLinkedList.pollFirst();
            System.out.println("Ninja removido com sucesso!");
            System.out.println("Ninja removido: " + ninjaRemovido);
        }
    }

    public void adicionarNinjaInicio() {
        System.out.println("Nome do ninja: ");
        String nome = scanner.nextLine();

        System.out.println("Idade do ninja: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Vila do ninja: ");
        String vila = scanner.nextLine();

        Ninja novoNinja = new Ninja(nome, idade, vila);
        ninjasLinkedList.addFirst(novoNinja);

        System.out.println("Ninja adicionado no início: " + novoNinja);
    }

    public void acessarPorPosicao() {
        System.out.println("Digite a posição (1 a " + ninjasLinkedList.size() + "): ");
        try {
            int posicao = scanner.nextInt() - 1;
            scanner.nextLine();

            if (posicao >= 0 && posicao < ninjasLinkedList.size()) {
                Ninja ninja = ninjasLinkedList.get(posicao);
                System.out.println("Ninja na posição " + (posicao + 1) + " é: " + ninja);
            } else {
                System.out.println("Você digitou uma posição invalida!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada errada! Digite um número.");
            scanner.nextLine();
        }
    }


}
