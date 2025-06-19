package NivelIntermediario.aulas.ClassesAbstratasXInterfaces;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Uzumaki Naruto";
        naruto.nomeDoNinja();
        naruto.tacarShuriken();

        System.out.println("------");

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Uchiha Sasuke";
        sasuke.nomeDoNinja();
        sasuke.tacarKunai();
    }
}
