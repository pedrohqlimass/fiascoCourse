package NivelIntermediario.aulas.OverloadConstrutoresEMetodos;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Uzumaki Naruto", "Aldeia da Folha", 16, 20, NivelNinja.GENIN);
        naruto.habilidadeEspecial();

        Uchiha sasuke = new Uchiha("Uchiha Sasuke", "Aldeia da Folha", 17, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        Uchiha itachi = new Uchiha("Uchiha Itachi", "Aldeia da Folha", 27, 500, NivelNinja.KAGE);
        itachi.habilidadeEspecial();

        Uchiha madara = new Uchiha("Uchiha Madara", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
    }
}
