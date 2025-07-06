package NivelIntermediario.aulas.EncapsulamentoGettersESetters;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Uzumaki Naruto", "Aldeia da Folha", 17, 50, 1.67);
        System.out.println("O nome do Ninja é: " + naruto.getNome());
        naruto.setNome("NarutooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo");
        System.out.println("O nome é: " + naruto.getNome());
    }
}
