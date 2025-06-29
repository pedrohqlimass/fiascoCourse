package NivelIntermediario.desafios.desafio05;

public class Main {
    public static void main(String[] args) {

        ContaCorrente naruto = new ContaCorrente("Uzumaki Naruto", 100, TipoConta.CORRENTE);
        naruto.depositar(50);
        naruto.consultarSaldo();
        System.out.println(naruto.toString());

        System.out.println("-----");

        ContaPoupanca sasuke = new ContaPoupanca("Uchiha Sasuke", 100, TipoConta.POUPANÇA);
        sasuke.depositar(50);
        sasuke.consultarSaldo();
        System.out.println(sasuke.toString());
    }
}
