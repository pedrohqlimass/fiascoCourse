package NivelIntermediario.aulas.SuperClassesXSubClasses;

public class Uchiha extends Ninja implements ClaDoNinja{

    @Override
    public void claDoNinja() {
        System.out.println("Eu sou do Clã UCHIHA");
    }

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " e essa é minha estrategia de batalha ninja");
    }
}
