package NivelIntermediario.aulas.List_ArrayList_Array;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        * Array
        * E estatico, nao altera de tamanho
        * */

        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        ninjasArray[3] = "Hinata";
        System.out.println("Printando Array = " + ninjasArray[0]);

        /*
        * Printando o Array usando FOR
        * */
        for (int i = 0; i < ninjasArray.length ; i++) {
            System.out.println("minjasArray = " + ninjasArray[i]);
        }

        System.out.println("-------------------");

        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Uzumaki Naruto");
        ninjasList.add("Uchiha Sasuke");
        ninjasList.add("Haruno Sakura");
        ninjasList.add("Hatake Kakashi");

        System.out.println("ninjasList = " + ninjasList);

        // Remover elementos
        ninjasList.remove("Hatake Kakashi");
        System.out.println("ninjasList = " + ninjasList);

        // Adicionar elementos
        ninjasList.add("Uchiha Madara");
        System.out.println("ninjasList = " + ninjasList);

        // Trocar elementos
        ninjasList.set(3,"Senju Hashirama");
        System.out.println("ninjasList = " + ninjasList);

        // Visualizar o tamanho da lista
        System.out.println(ninjasList.size());
    }
}
