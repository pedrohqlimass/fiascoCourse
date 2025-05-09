package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternario: São maneiras de reduzir o codigo
        * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;
        * */

        String nome = "Naruto Uzumaki";
        int idade = 16;
        short numeroDeMissoes = 2;

        String nivelDoNinja = (numeroDeMissoes >= 10 ) ? "Esse ninja está com mais de 10 missões" : "Esse ninja está com menos de 10 missões";
        System.out.println(nivelDoNinja);

    }
}
