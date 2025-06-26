package NivelIntermediario.aulas.ToString;

public class Uzumaki extends Ninja{

    String habilidadeEspecial;

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, String habilidadeEspecial) {
        super(nome, aldeia, idade);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    @Override
    public String toString(){
        return "Meu nome é " + nome + " tenho " + idade+ "anos"+". Sou um ninja da "+ aldeia + " e ja adquiri o " + habilidadeEspecial;
    }
}
