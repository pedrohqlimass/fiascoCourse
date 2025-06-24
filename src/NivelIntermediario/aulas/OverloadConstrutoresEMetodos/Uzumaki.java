package NivelIntermediario.aulas.OverloadConstrutoresEMetodos;

public class Uzumaki extends Ninja{

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluida, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluida, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial, um ataque de ar. E eu completei " + numeroDeMissoesConcluida + " missões");
    }
}
