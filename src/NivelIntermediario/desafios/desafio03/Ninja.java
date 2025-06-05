package NivelIntermediario.desafios.desafio03;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("Ninja: " + nome + "\nIdade: " + idade + " anos" + "\nMissão: " + missao + "\nNivel da Missão: " + nivelDificuldade +"\nStatus da Missão: " + statusMissao);
    }
}
