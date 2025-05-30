package NivelIntermediario.treinos;

import java.lang.invoke.StringConcatFactory;

public class Carro {

    String marca;
    String modelo;
    String tipo;
    String motor;
    int anoFabricacao;
    int cavalos;
    int torque;
    int rpmMax;

    public void ativarTurbo(){
        System.out.println("Turbo ativado!");
    }

    public int calcularIdadeCarro(int anoAtual){
        return anoAtual - anoFabricacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Seu carro é um ").append(marca)
                .append("\nModelo: ").append(modelo)
                .append("\nAno: ").append(anoFabricacao)
                .append("\nMotor: ").append(motor)
                .append("\nPotência: ").append(cavalos).append(" cv")
                .append("\nTorque: ").append(torque).append("Nm")
                .append("\nRPM Máximo: ").append(rpmMax).append("RPM");
        return sb.toString();
    }
}
