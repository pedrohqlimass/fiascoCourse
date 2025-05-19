package NivelBasico.Desafios;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] ninjas = new String[5];//Array fixo para até 5 ninjas
        int contador = 0;//quantidade de ninjas cadastrados
        int opcao = 0;

        //Usando while para repetir até o úsuario escolher sair
        while (opcao != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (contador < 5) {
                        System.out.println("Digite o nome do seu Ninja: ");
                        String nome = scanner.nextLine();
                        ninjas[contador] = nome;
                        contador++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de ninjas atingido.");
                    }
                    break;

                case 2:
                    System.out.println("\n---- Lista de Ninjas ----");
                    if (contador == 0){
                        System.out.println("Nenhum Ninja cadastrado.");
                    }else{
                        for (int i = 0; i < contador; i++) {
                            System.out.println((i + 1) + ". " + ninjas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção invalida");
            }


        }
        scanner.close();
    }
}
