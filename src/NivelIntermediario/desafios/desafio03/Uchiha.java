package NivelIntermediario.desafios.desafio03;

public class Uchiha extends Ninja {

    String habilidadeEspecial;

    public void mangekyouSharingan() {
        System.out.println("Ao ativar o Mangekyou Sharingan, meus olhos revelam técnicas que poucos podem compreender.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes(); //Chama metodo  mostrarInformacoes() da Superclasse Ninja
        System.out.println("Habilidade Especial: " + habilidadeEspecial); //Exibe a habilidade especial de Itachi
    }
}