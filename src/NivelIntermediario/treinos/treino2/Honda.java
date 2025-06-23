package NivelIntermediario.treinos.treino2;

public class Honda extends Carro implements VerificarOleoCorreto{

    @Override
    public void verificarOleoCorreto() {
        if (anoDoCarro <= 2011) {
            System.out.println("O Oĺeo correto é o 10w30");
        }else {
            System.out.println("O òleo do carro é o 0w20");
        }
    }

    @Override
    public void naoESuccao() {
        super.naoESuccao();
    }

    @Override
    public void succao() {
        super.succao();
    }

    public Honda(double potencia, int anoDoCarro, double litrosDeOleo, String viscosidade) {
        super(potencia, anoDoCarro, litrosDeOleo, viscosidade);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
    }
}
