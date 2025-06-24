package NivelIntermediario.aulas.OverloadConstrutoresEMetodos;

public class Uchiha extends Ninja{

    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluida, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluida, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial, um ataque de fogo. E eu já completei " + numeroDeMissoesConcluida + " missões");
    }
}
