package NivelIntermediario.aulas.OverloadConstrutoresEMetodos;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Uzumaki Naruto", "Aldeia da Folha", 16, 20, NivelNinja.GENIN);
        naruto.habilidadeEspecial();
        //metodo comum
        naruto.inteligenciaDeCombate();
        //metodo sobrecarregado
        naruto.inteligenciaDeCombate(100);

        System.out.println("-------");

        Uchiha sasuke = new Uchiha("Uchiha Sasuke", "Aldeia da Folha", 17, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();
        //metodo comum
        sasuke.inteligenciaDeCombate();
        //metodo sobrecarregado
        sasuke.inteligenciaDeCombate(150);

        System.out.println("-------");

        Uchiha itachi = new Uchiha("Uchiha Itachi", "Aldeia da Folha", 27, 500, NivelNinja.KAGE);
        itachi.habilidadeEspecial();
        //metodo comum
        itachi.inteligenciaDeCombate();
        //metodo sobrecarregado
        itachi.inteligenciaDeCombate(198);

        System.out.println("-------");

        Uchiha madara = new Uchiha("Uchiha Madara", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        //metodo comum
        madara.inteligenciaDeCombate();
        //metodo sobrecarregado
        madara.inteligenciaDeCombate(180);
    }
}
