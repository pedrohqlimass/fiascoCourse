package treinos;

import java.util.Scanner;

public class tabuadaDoUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para ver a tabuada");
        int numeroDoUsuario = scanner.nextInt();

        System.out.println("Tabuda do " + numeroDoUsuario + " usando laço 'for': ");
        for (int i = 0; i < 11; i++) {
            System.out.println(numeroDoUsuario + " x " + i + " = " + (numeroDoUsuario * i));

            scanner.close();
        }
    }
}
