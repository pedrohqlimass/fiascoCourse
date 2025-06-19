package NivelIntermediario.aulas.PolimorfismoAbstracao;

public class Main {

    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Uzumaki Naruto";
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        System.out.println("-------");

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Uchiha Sasuke";
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();


    }
}
