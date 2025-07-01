package NivelIntermediario.treinos.treino3;

public abstract class Veiculo {

    String modelo;
    String cor;
    int ano;

    public Veiculo(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public abstract void movimentar();

    public void informacoes(){
        System.out.println("Informações do veículo: " + modelo + ", " + cor + ", " + ano );
    }

    public void informacoes(String tipoCombustivel){
        System.out.println("Informações do veículo: " + modelo + ", " + cor + ", " + ano + ", " + tipoCombustivel);
    }
}
