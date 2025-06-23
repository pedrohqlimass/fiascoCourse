package NivelIntermediario.treinos.treino2;

public class Chevrolet extends Carro implements Succao, VerificarOleoCorreto, VerificarSeESuccao {

    int marchasDoCarro;

    @Override
    public void verificarSeESuccao() {
        if (anoDoCarro >= 2013 && potencia == 1.4){
            super.succao();
        }else {
            super.naoESuccao();
        }
    }

    @Override
    public void verificarOleoCorreto() {
        if(marchasDoCarro == 5) {
            System.out.println("O óleo correto é o 5w30");
        } else if (marchasDoCarro == 6) {
            System.out.println("O óleo correto é o 0w20");
        }else {
            System.out.println("seu carro não tem câmbio?");
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

    public Chevrolet(double potencia, int anoDoCarro, double litrosDeOleo, String viscosidade, int marchasDoCarro) {
        super(potencia, anoDoCarro, litrosDeOleo, viscosidade);
        this.marchasDoCarro = marchasDoCarro;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
    }
}
