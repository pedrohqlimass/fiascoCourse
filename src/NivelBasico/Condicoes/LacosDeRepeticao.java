package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        *Lacços de Repetição vão  repetir infinitamente ou até atingir o limite
        * WHILE = FOR
        * */

        //WHILE
        // while (condicao) {tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        /*while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O Naruto fez um clones");*/
            
            //FOR
            for (int i = 0; i <= numeroMaximoDeClones; i++) {
                System.out.println("O naruto esta se clonando e ja se clonou: " + i);

        }
    }
}
