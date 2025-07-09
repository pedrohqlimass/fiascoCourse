package NivelIntermediario.aulas.Enums;

public class Missoes {

    private String nome;
    private RankDeMissoes rankDeMissoes;

    //metodo para mostrar mais informações

    public void exibirDetalhes(){
        System.out.println("Missão: " + nome + " | Rank: " + rankDeMissoes + " | Descrição: " + rankDeMissoes.getDescricao() + " | Dificuldade: " + rankDeMissoes.getDificuldade());
    }

    public Missoes(String nome, RankDeMissoes rankDeMissoes) {
        this.nome = nome;
        this.rankDeMissoes = rankDeMissoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRankDeMissoes() {
        return rankDeMissoes;
    }

    public void setRankDeMissoes(RankDeMissoes rankDeMissoes) {
        this.rankDeMissoes = rankDeMissoes;
    }
}
