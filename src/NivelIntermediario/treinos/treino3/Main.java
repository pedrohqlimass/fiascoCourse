package NivelIntermediario.treinos.treino3;

public class Main {
    public static void main(String[] args) {

        Carro hb20 = new Carro("Hyundai HB20", "Prata", 2024);
        hb20.informacoes("Flex");
        hb20.movimentar();
        hb20.ligarMotor();

        System.out.println("---------");

        Bicicleta bmx = new Bicicleta("BMX", "Azul", 2009);
        bmx.informacoes();
        bmx.movimentar();
        bmx.empurrar();

        System.out.println("---------");

        Caminhao volvo = new Caminhao("Volvo FH16 750", "Branco", 2025);
        volvo.informacoes("DIESEL");
        volvo.movimentar();
        volvo.ligarMotor();
    }
}
