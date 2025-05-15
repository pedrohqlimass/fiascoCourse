package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados nao primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja, e atribuir metodos a eles
        */

        String name = "Naruto Uzumaki";
        String nameToUpperCase = name.toUpperCase(); // toUpperCase vai colocar tudo em capslock
        System.out.println("Esse texto esta em capslock "+nameToUpperCase);
        System.out.println("esse esta sem capslock" +name);

        String aldeia ="Aldeia da folha";
        String aldeiaToLowerCase = aldeia.toLowerCase();
        System.out.println("o nome da aldeia esta em minúsculo = " + aldeiaToLowerCase);
    }
}
