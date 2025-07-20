package NivelIntermediario.aulas.Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 123451234);
        System.out.println("cadastro = " + cadastro);
        System.out.println("cadastro = " + cadastro.getNome().toUpperCase());

        NinjaRecord cadastrousandoRecord = new NinjaRecord("Sasuke", "sasuke@email.com", 1234356456);
        System.out.println("cadastrousandoRecord = " + cadastrousandoRecord.emailCaixaAlta());
    }
}
