package Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        /*
         * If e Else - Condicoes
         * else if
         * Objetivo: Passar o ninja de nivel de acordo com o numero de missoes
         * */

        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 20;
        boolean hokage = false;
        short numeroDeMissoes = 21;

        //se (condicao) (faca isso)
        if (numeroDeMissoes == 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20 && idade >= 18){
            System.out.println("Rank: Jounin");
        }else {
            System.out.println("Rank: Gennin");
        }
        
        Long saldoNaConta = 5000L;
        if (saldoNaConta >= 5399){
            System.out.println("Vou comprar um Xbox Series X");
        } else if (saldoNaConta >= 3900 && saldoNaConta < 5399) {
            System.out.println("Vou ter que comprar um PS5");
        }else {
            System.out.println("Vou de Nintendo Swicth memo");
        }
    }
}
