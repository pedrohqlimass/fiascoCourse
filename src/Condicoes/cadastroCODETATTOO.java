package Condicoes;

import java.util.Scanner;

public class cadastroCODETATTOO {
    public static void main(String[] args) {

        System.out.println("Seja Bem Vindo á CODETATTOO!!");

        // Abre o scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeDoUsuario = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idadeDoUsuario = scanner.nextInt();
        if (idadeDoUsuario < 18) {
            System.out.println("Só aceitamos maiores de 18 anos");
            scanner.close();
            return; // encerra o programa
        } else {
            System.out.println("Seja Bem Vindo, " + nomeDoUsuario + "!");
        }
        System.out.println("Digite seu CPF: ");
        Long cpfDoUsuario = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Escolha o dia da sessão (Segunda a Sexta)");
        String diaDaSemana = scanner.nextLine().trim().toUpperCase();

        if (diaDaSemana.equalsIgnoreCase("Segunda")
                || diaDaSemana.equalsIgnoreCase("Terça")
                || diaDaSemana.equalsIgnoreCase("Quarta")
                || diaDaSemana.equalsIgnoreCase("Quinta")
                || diaDaSemana.equalsIgnoreCase("Sexta")){
        }else {
            System.out.println("Não abrimos aos Sábados e Domingos.");
            scanner.close();
            return;
        }


        System.out.println("Digite o horário de sua preferência: ");
        String horarioDoUsuario = scanner.nextLine();

        System.out.println("Prezado Cliente: " + nomeDoUsuario
                + "\nIdade: " + idadeDoUsuario
                + "\nCPF: " + cpfDoUsuario
                + "\nSua sessão será na: " + diaDaSemana
                + "\nNo horário: " + horarioDoUsuario);


        scanner.close();
    }
}
