package NivelIntermediario.treinos.treino3;

public class Bicicleta extends Veiculo implements NaoMotorizado{

    public Bicicleta(String modelo, String cor, int ano) {
        super(modelo, cor, ano);
    }

    @Override
    public void movimentar() {
        System.out.println("A Bicicleta está pedalando");
    }

    @Override
    public void empurrar() {
        System.out.println("A " + modelo + " está sendo empurrada");
    }
}
