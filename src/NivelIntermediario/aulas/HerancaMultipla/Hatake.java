package NivelIntermediario.aulas.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface{

    public void hokageAtivo() {
        System.out.println(nome + ": Eu sou um Hokage");
    }

    public void ninjaDeElite() {
        System.out.println(nome + ": Eu sou um Ninja de Elite da Anbu");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o SHARINGAN");
    }

    public void boasVindas(){
        System.out.println(nome + ": Eu sou um Hatake");
    }
}
