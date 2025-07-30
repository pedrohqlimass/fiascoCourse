package NivelIntermediario.aulas.Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Array
        String[] ninjasArray = new String[6];

        //List
        List<String> ninjasList = new ArrayList<>();

        //Stack
        Stack<String> ninjasStack = new Stack<>();

        //Queue
        // HEAD = Primeiro dado inserido | TAIl = Ultimo dado inserido
        Queue<String> ninjasQueue = new LinkedList<>();

        //adicionar um dado na fila
        ninjasQueue.add("Uzumaki Naruto");
        ninjasQueue.add("Uchiha Sasuke");
        ninjasQueue.add("Haruno Sakura");
        ninjasQueue.add("Hatake Kakashi");
        ninjasQueue.add("Nara Shikamaru");

        //mostrar fila
        System.out.println("Ninjas na Queue = " + ninjasQueue);
        ninjasQueue.poll(); //remover o HEAD
        System.out.println("Ninjas na Queue depois do poll = " + ninjasQueue);

        //Mostrar o HEAD
        System.out.println("Ninja no HEAD com peek = " + ninjasQueue.peek());

        ninjasQueue.add("Senju Hashirama");
        ninjasQueue.add("Senju Tobirama");
        System.out.println("NInjas na Queue Atualizado = " + ninjasQueue);

        //Não da pra deletar o TAIL

        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();

        System.out.println("NInjas na Queue Atualizado = " + ninjasQueue);

        //Verificar se a Queue esta vazia
        if (ninjasQueue.isEmpty()) {
            System.out.println("a fila esta vazia");
        }else {
            System.out.println("a fila esta cheia");
        }


    }
}
