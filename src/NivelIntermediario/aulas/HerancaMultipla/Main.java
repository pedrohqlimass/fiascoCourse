package NivelIntermediario.aulas.HerancaMultipla;

public class Main {
    public static void main(String[] args) {


        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Uchiha Sasuke";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.sharinganAtivado();

        Hatake kakashi = new Hatake();
        kakashi.nome = "Hatake Kakashi";
        kakashi.aldeia = "Aldeia da Folha";
        kakashi.idade = 48;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
        kakashi.hokageAtivo();
    }
}
