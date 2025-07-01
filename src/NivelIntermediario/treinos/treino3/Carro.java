package NivelIntermediario.treinos.treino3;

public class Carro extends Veiculo implements Motorizado{

    public Carro(String modelo, String cor, int ano) {
        super(modelo, cor, ano);
    }

    @Override
    public void movimentar() {
        System.out.println("O Carro está dirigindo");
    }

    @Override
    public void ligarMotor() {
        System.out.println("O " + modelo + " está ligado");
    }
}
