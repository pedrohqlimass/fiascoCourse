package NivelIntermediario.treinos.treino2;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        Honda civic = new Honda(2.0, 2018, 4.0, "0w20");
        civic.mostrarInformacoes();
        civic.succao();
        civic.verificarOleoCorreto();

        System.out.println("------");

        Honda city = new Honda(1.5,2010, 3.7, "10w30");
        city.mostrarInformacoes();
        city.succao();

        System.out.println("------");

        Chevrolet onix = new Chevrolet(1.4, 2018, 3.5, "", 5);
        onix.mostrarInformacoes();
        onix.verificarOleoCorreto();
        onix.verificarSeESuccao();


    }
}
