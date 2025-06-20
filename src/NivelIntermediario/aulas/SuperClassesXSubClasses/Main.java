package NivelIntermediario.aulas.SuperClassesXSubClasses;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Uzumaki Naruto", "Aldeia da Folha", 17);
        System.out.println(naruto.toString());
        naruto.claDoNinja();

        System.out.println("--------");

        Uchiha sasuke = new Uchiha("Uchiha Sasuke", "Aldeia da Folha", 18);
        System.out.println(sasuke.toString());
        sasuke.claDoNinja();

        System.out.println("--------");

        Uchiha itachi = new Uchiha("Uchiha Itachi", "Aldeia da Folha",25);
        System.out.println(itachi.toString());
        itachi.claDoNinja();

    }
}
