package NivelIntermediario.aulas.ToString;

public class Uchiha extends Ninja{

    String nivelSharingan;

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, String nivelSharingan) {
        super(nome, aldeia, idade);
        this.nivelSharingan = nivelSharingan;
    }

    @Override
    public String toString(){
        return "Meu nome é " + nome + " tenho " + idade+ "anos"+". Sou renegado da "+ aldeia + " e ja adquiri o " + nivelSharingan;
    }
}
