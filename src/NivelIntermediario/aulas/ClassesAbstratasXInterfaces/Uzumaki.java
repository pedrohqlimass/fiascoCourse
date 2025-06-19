package NivelIntermediario.aulas.ClassesAbstratasXInterfaces;

public class Uzumaki extends Ninja implements NinjaInterface{

    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é: " + nome);
    }

    @Override
    public void tacarShuriken() {
        System.out.println(nome + " tacou uma Shuriken");
    }
}
