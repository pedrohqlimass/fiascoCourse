package NivelIntermediario.desafios.desafio05;

public abstract class ContaBancaria implements Conta {

    String nomeCliente;
    protected double saldo;
    TipoConta tipoConta;


    public ContaBancaria(String nomeCliente, double saldoInicial, TipoConta tipoConta) {
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
        this.tipoConta = tipoConta;
    }



    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public abstract void depositar(double valor);
}
