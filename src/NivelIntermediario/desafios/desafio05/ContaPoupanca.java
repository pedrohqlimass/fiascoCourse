package NivelIntermediario.desafios.desafio05;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String nomeCliente, double saldoInicial, TipoConta tipoConta) {
        super(nomeCliente, saldoInicial, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        double taxa = valor * 0.06;
        double valorComTaxa = valor - taxa;
        this.saldo += valorComTaxa;
        System.out.println("Valor da taxa: " + taxa);
    }

    @Override
    public double consultarSaldo() {
        return super.consultarSaldo();
    }

    @Override
    public String toString() {
        return "Cliente " + nomeCliente + " tem um saldo final de " + saldo + " em sua conta " + tipoConta;
    }
}
