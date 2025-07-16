package NivelIntermediario.aulas.Generics2;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken(3));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocar Gamakichi"));
        bolsaNinja.adicionarFerramenta(new CompanheiroNinja("Kinkou"));

        System.out.println("Itens da Lista de ferramentas: ");
        bolsaNinja.mostrarFerramentas();
    }
}
