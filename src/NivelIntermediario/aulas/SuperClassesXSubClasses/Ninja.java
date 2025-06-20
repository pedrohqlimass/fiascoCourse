package NivelIntermediario.aulas.SuperClassesXSubClasses;

public abstract class Ninja implements estrategiaDeBatalhaNinja{

    String nome;
    String aldeia;
    int idade;


    public String toString(){
        return "Meu nome é " + this.nome + ", sou da " + this.aldeia + " e tenho " + this.idade;
    }

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " e essa é minha estrategia de batalha ninja");
    }
}
