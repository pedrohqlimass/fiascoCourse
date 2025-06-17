package NivelIntermediario.desafios.desafio04;

public class MaitoGai extends NinjaAvancado implements NinjaAcoes{

    public MaitoGai(String nome, int idade, String habilidade, String especialidade, tipoHabilidade tipoHabilidade) {
        super(nome, idade, habilidade, especialidade, tipoHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " está liberando toda sua força com o Oitavo Portão... Sinta o poder do combate supremo!");
    }
}