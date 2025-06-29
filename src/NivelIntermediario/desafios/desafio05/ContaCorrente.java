package NivelIntermediario.desafios.desafio05;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String nomeCliente, double saldoInicial, TipoConta tipoConta) {
        super(nomeCliente, saldoInicial, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "Cliente " + nomeCliente + " tem um saldo final de " + saldo + " em sua conta " + tipoConta;
    }
}
