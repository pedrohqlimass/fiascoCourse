package Condicoes;
import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
         /*
         *SwitchCases: Que servem para gerar casos específicos.
         *Objetivo: Pedir para o usuário escolher entre os ninjas
         * switchCase
         * */

        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar opções para o usuario
        System.out.println("Escolha algum desses ninjas: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir para o usuario escolher uma das opções
        int escolhaDoUsuario = scanner.nextInt();
        System.out.println("Voçê digitou o número: " + escolhaDoUsuario);

        // Reação ao escolher um personagem
        switch (escolhaDoUsuario){
            case 1:
                System.out.println("O usuario escolher o Naruto Uzumaki, datebayou kkk");
                break;
            case 2:
                System.out.println("O Usuario escolheu o Sasuke Uchiha, o doido revoltado");
                break;
            case 3:
                System.out.println("O usuario escolher a Sakura Haruno, a ninja inutil");
                break;
            default:
        }

        // fechar o scanner
        scanner.close();
    }
}
