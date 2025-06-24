package NivelIntermediario.aulas.OverloadConstrutoresEMetodos;

public class Ninja implements EstrategiaDeBatalhaNinja {

    //TODO: Incluir novos 2 atributos: numeroDeMissoesConcluidas , rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluida;
    NivelNinja rank;


    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: sobrecarga do construtor chamando os novos atributos
    //Sobrecarga de construtores você não precisa redeclarar o construtor, só os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluida, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluida = numeroDeMissoesConcluida;
        this.rank = rank;
    }

    //metodo geral - todos os ninjas vao ter
    public void habilidadeEspecial(){
        System.out.println("Meu nome é "  + nome + " e esse é meu ataque especial");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " e essa é minha estrategia de batalha");
    }

}
