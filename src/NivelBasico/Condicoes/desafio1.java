package Condicoes;

public class desafio1 {
    public static void main(String[] args) {

        String ninja01 = "Naruto Uzumaki";
        int idadeNinja01 = 10;
        String nomeDaMissaoNinja01 = "Resgatar dois gatos de uma arvore";
        char nivelDaMissaoNinja01 = 'C';
        boolean statusDaMissaoNinja01 = false;

        String ninja02 = "Kakashi Hatake";
        int idadeNinja02 = 22;
        String nomeDaMissaoNinja02 = "Capturar o Kabuto";
        char nivelDaMissaoNinja02 = 'B';
        boolean statusDaMissaoNinja02 = true;

        String ninja03 = "Minato Namikaze";
        int idadeNinja03 = 24;
        String nomeDaMissaoNinja03 = "Salvar Konoha do ataque da Raposa de nove caudas";
        char nivelDaMissaoNinja03 = 'S';
        boolean statusDaMissaoNinja03 = true;

        if (statusDaMissaoNinja01 == true && idadeNinja01 < 15 || nivelDaMissaoNinja01 == 'C' || nivelDaMissaoNinja01 == 'D'){
            System.out.println("Ninja: "+ninja01+" - Missão Concluída!");
        }else {
            System.out.println("Ninja: "+ninja01+" - Missão Não Concluída.");
        }

        if (statusDaMissaoNinja02 == true && idadeNinja02 >= 15 || nivelDaMissaoNinja02 == 'C' || nivelDaMissaoNinja02 == 'D'){
            System.out.println("Ninja: "+ninja02+" - Missão Concluída");
        }else {
            System.out.println("Ninja: "+ninja02+" - Missão Não Concluída.");
        }

        if (statusDaMissaoNinja03 == true && idadeNinja03 >= 15 || nivelDaMissaoNinja03 == 'C' || nivelDaMissaoNinja03 == 'D'){
            System.out.println("Ninja: "+ninja03+" - Missão Concluída!");
        }else {
            System.out.println("Ninja: "+ninja03+" - Missão Não Concluída.");

        }
    }
}
