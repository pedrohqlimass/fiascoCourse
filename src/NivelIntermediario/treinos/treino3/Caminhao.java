package NivelIntermediario.treinos.treino3;

public class Caminhao extends Veiculo implements Motorizado{

    public Caminhao(String modelo, String cor, int ano) {
        super(modelo, cor, ano);
    }

    @Override
    public void movimentar() {
        System.out.println("O caminhão está rodando");
    }

    @Override
    public void ligarMotor() {
        System.out.println("Motor do " + modelo + " está ligado");
    }
}
