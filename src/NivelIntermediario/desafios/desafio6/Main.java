package NivelIntermediario.desafios.desafio6;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Ninja> lista = new LinkedList<>();

        SistemaNinja sistemaNinja = new SistemaNinja(lista, scanner);
        int opcao;

        do {
            System.out.println("=============SISTEMA GERENCIADOR DE NINJAS=============");
            System.out.println("1. Caso queira ninjas pré-definidos");
            System.out.println("2. Exibir lista completa.");
            System.out.println("3. Remover primeiro ninja.");
            System.out.println("4. Adicionar ninja no início.");
            System.out.println("5. Acessar por posição.");
            System.out.println("0. Sair do programa.");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        sistemaNinja.inicializarNinjas();
                        break;
                    case 2:
                        sistemaNinja.exibirNinjas();
                        break;
                    case 3:
                        sistemaNinja.removerPrimeiroNinja();
                        break;
                    case 4:
                        sistemaNinja.adicionarNinjaInicio();
                        break;
                    case 5:
                        sistemaNinja.acessarPorPosicao();
                        break;
                    case 0:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção invalida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção invalida. Tente novamente!");
                scanner.nextLine();
                opcao = -1;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
