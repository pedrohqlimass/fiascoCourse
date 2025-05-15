package NivelBasico.treinos;

import java.util.Scanner;

public class calculandoNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do seu caderno: ");
        float notaCaderno = scanner.nextFloat();

        System.out.println("Digite a nota do seu trabalho: ");
        float notaTrabalho = scanner.nextFloat();

        System.out.println("Digite a nota da sua prova: ");
        float notaProva = scanner.nextFloat();

        float total = notaCaderno + notaTrabalho + notaProva;
        float media = total / 3;

        System.out.println("A sua nota média é: " + total /3);

        String resultado = (media < 6) ? "Você foi reprovado" : "Você foi aprovado";
        System.out.println(resultado);

        scanner.close();
    }
}
