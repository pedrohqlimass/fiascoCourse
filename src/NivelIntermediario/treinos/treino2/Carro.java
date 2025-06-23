package NivelIntermediario.treinos.treino2;

public abstract class Carro implements Succao{

    double potencia;
    int anoDoCarro;
    double litrosDeOleo;
    String viscosidade;

    @Override
    public void naoESuccao() {
        System.out.println("O carro não é Sucção, pois o carter é de ferro");
    }

    @Override
    public void succao() {
        System.out.println("O carro é Sucção, pois o carter é de aluminio");
    }

    public Carro(double potencia, int anoDoCarro, double litrosDeOleo, String viscosidade) {
        this.potencia = potencia;
        this.anoDoCarro = anoDoCarro;
        this.litrosDeOleo = litrosDeOleo;
        this.viscosidade = viscosidade;
    }

    public void mostrarInformacoes(){
        System.out.println("O carro é " + potencia + ", vai " + litrosDeOleo + " litros de óleo " + viscosidade);
    }
}
