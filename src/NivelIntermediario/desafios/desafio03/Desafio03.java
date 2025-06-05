package NivelIntermediario.desafios.desafio03;

public class Desafio03 {
    public static void main(String[] args) {

        Ninja shikamaru = new Ninja();
        shikamaru.nome = "Nara Shikamaru";
        shikamaru.idade = 18;
        shikamaru.missao = "Planejar defesa e liderar equipe contra invasão inimiga.";
        shikamaru.nivelDificuldade = "Rank A";
        shikamaru.statusMissao = "Em progresso";
        shikamaru.mostrarInformacoes();

        System.out.println("-----");

        Uchiha itachi = new Uchiha();
        itachi.nome = "Uchiha Itachi";
        itachi.idade = 13;
        itachi.missao = "Investigar e neutralizar grupo suspeito na fronteira da aldeia.";
        itachi.nivelDificuldade = "Rank A";
        itachi.statusMissao = "Concluída com sucesso";
        itachi.habilidadeEspecial = "Tsukuyomi";
        itachi.mostrarInformacoes();
        itachi.mangekyouSharingan();
    }
}
