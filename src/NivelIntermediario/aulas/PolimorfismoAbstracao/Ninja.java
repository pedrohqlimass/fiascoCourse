package NivelIntermediario.aulas.PolimorfismoAbstracao;

public abstract class Ninja implements EstrategiaDeBatalha {

    String nome;
    String aldeia;
    int idade;

    //metodo geral - todos os ninjas vao ter
    public void habilidadeEspecial(){
        System.out.println("Meu nome é "  + nome + " e esse é meu ataque especial");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " e essa é minha estrategia de batalha");
    }
}
