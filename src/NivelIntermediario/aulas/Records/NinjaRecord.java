package NivelIntermediario.aulas.Records;

public record NinjaRecord(String nome, String email, int telefone) {

    /*
    * Todos os atributos são final
    * Records não tem Setters
    *
    * */

    public String emailCaixaAlta(){
        return email.toUpperCase();
    }
}
