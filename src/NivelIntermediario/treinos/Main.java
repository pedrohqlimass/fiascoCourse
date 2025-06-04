package NivelIntermediario.treinos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Carro hondaS2000 = new Carro();
        hondaS2000.marca = "Honda";
        hondaS2000.modelo = "S2000";
        hondaS2000.anoFabricacao = 2005;
        hondaS2000.cavalos = 250;
        hondaS2000.torque =  218;
        hondaS2000.rpmMax = 9000;
        hondaS2000.tipo = "2.0L 4 cilindros em linha";
        hondaS2000.motor = "F20C";

        //hondaS2000.ativarTurbo();
        String mostrarCaracteristicas = hondaS2000.toString();
        System.out.println(mostrarCaracteristicas);

        //Usando LocalDate
        int anoAtual = LocalDate.now().getYear(); //Pega o ano atual automaticamente
        int idadeDoCarro = hondaS2000.calcularIdadeCarro(anoAtual);

        System.out.println("Seu carro foi fabricado em " + hondaS2000.anoFabricacao + " e fazem " + idadeDoCarro + " anos que foi fabricado"  );
        System.out.println("Uma máquina rara!");

    }
}