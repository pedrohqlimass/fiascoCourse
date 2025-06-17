package NivelIntermediario.desafios.desafio04;

public class NinjaAvancado extends NinjaBasico implements NinjaAcoes {


    String especialidade;

    private tipoHabilidade tipoHabilidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Ninja: " + nome + " \nIdade: " + idade + " \nHabilidade: " + habilidade + "\nHabilidade Especial: " + especialidade);

    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " está executando: " + especialidade + "... Prepare-se para ser destruído!");
    }

    @Override
    public void mostrarTipoHabilidade() {
        System.out.println("Tipo Habilidade: " + tipoHabilidade);
    }

    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade, tipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
        this.tipoHabilidade = tipoHabilidade;
    }
}