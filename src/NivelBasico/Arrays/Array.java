package NivelBasico.Arrays;

public class Array {
    public static void main(String[] args) {

        //Arrays são tipo referência
        //String inicializa com 'null'
        //O java vai excluir esse array automaticamente usadno o Garbage Collecttor.
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";
        //System.out.println(ninja[3]);

        //Redeclarar
        String nomeDoNinja = "Naruto Uzumaki";
        nomeDoNinja = "Boruto Uzumaki";
        //System.out.println(nomeDoNinja);

        //Redeclarar ARRAY
        //uma vez que um array é declarado, você pode atribuir novos valores, mas não pode redeclará-lo diretamente sem perder os dados atuais.
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";
        System.out.println(ninja[4]);

        // For para fazer um Loop no array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
            
        }

        //Array idade
        //int inicicaliza com '0'
        int[] idade = new int[2];
        idade[0] = 16;
        //System.out.println(idade[0]);

    }
}
