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

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " e essa é minha ESTRATÉGIA de batalha");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {

        if (qi > 150){
            System.out.println("Seu QI é: " + qi + " e voce é um genio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e voce é um ninja promissor");
        }else {
            System.out.println("Seu QI é: " + qi + " e voce precisa treinar mais");
        }
    }
}
