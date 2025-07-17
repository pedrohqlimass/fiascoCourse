package NivelIntermediario.treinos.treino4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        /*
         * Cria o cadastro de um ArrayList vazio
         * */

        CadastroClientes<Object> cadastroClientes = new CadastroClientes<>(new ArrayList<>());

        int opcao;

        do {
            System.out.println("---------CADASTRO---------");
            System.out.println("1 - Cadastrar um nome");
            System.out.println("2 - Buscar nomes");
            System.out.println("3 - Listar nomes");
            System.out.println("4 - Remover nome");
            System.out.println("5 - Sair");
            System.out.print("Escolha um Opçao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); //Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("Digite um nome para cadastrar: ");
                    String nomeCadastro = scanner.nextLine();
                    cadastroClientes.adicionarCliente(nomeCadastro);
                    System.out.println(nomeCadastro + " - cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite um nome para buscar: ");
                    String nomeBuscar = scanner.nextLine();
                    cadastroClientes.buscarCliente(nomeBuscar);
                    System.out.println(nomeBuscar + " - buscado com sucesso!");
                    break;

                case 3:
                    System.out.println("---------CADASTRO---------");
                    cadastroClientes.listarClientes();
                    break;

                case 4:
                    System.out.println("Digite um nome para remover: ");
                    String nomeRemover = scanner.nextLine();
                    if (cadastroClientes.buscarCliente(nomeRemover) >= 0) {
                        cadastroClientes.removerCliente(nomeRemover);
                        System.out.println(nomeRemover + " - removido com sucesso!");
                    }else {
                        System.out.println(nomeRemover + " - não encontrado");
                    }
                    break;

                case 5:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opçao invalida - TENTE NOVAMENTE!");
            }
        }while (opcao!= 5);

        scanner.close();
    }
}