package NivelIntermediario.desafios.desafio04;

public class NinjaBasico implements NinjaAcoes {

    String nome;
    int idade;
    String habilidade;

    private tipoHabilidade tipoHabilidade;

    public void mostrarTipoHabilidade(){
        System.out.println("Tipo Habilidade: " + tipoHabilidade);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Ninja: " + nome + " \nIdade: " + idade + " \nHabilidade: " + habilidade);

    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " está executando: " + habilidade +"... Agora você está preso!");
    }

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, String habilidade, tipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }

}