package NivelIntermediario.aulas.Contrutores;

import javax.swing.plaf.basic.BasicSplitPaneUI;

public class Hokage {

    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public Hokage(String nome) {
        this.nome = nome;
    }

    public Hokage(int idade) {
        this.idade = idade;
    }

    public Hokage(String nome, boolean vivoOuNao) {
        this.vivoOuNao = vivoOuNao;
    }

    //AllArgs Constructor
    public Hokage(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }

    //NoArgs Constructor
    public Hokage() {
    }
}
