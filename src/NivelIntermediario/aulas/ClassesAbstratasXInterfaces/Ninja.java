package NivelIntermediario.aulas.ClassesAbstratasXInterfaces;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;

    public abstract void nomeDoNinja();

    public void tacarKunai(){
        System.out.println("Meu nome é " + nome + " e eu taquei uma Kunai");
    }
}
