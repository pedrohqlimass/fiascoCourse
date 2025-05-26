package NivelBasico.Arrays;

public class ArraysMultidimensionais {
    public static void main(String[] args) {

        // Criação de uma matriz 3x3 onde cada linha representa uma aldeia e seus respectivos dois ninjas
        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto Uzumaki";
        ninjasEAldeias[0][2] = "Sasuke Uchiha";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza Momoshi";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        //For para printar todos os dados do Array
        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeias[i][0]
                    + " | Ninja 1: " + ninjasEAldeias[i][1]
                    + " | Ninja 2: " + ninjasEAldeias[i][2]);
        }
    }
}
