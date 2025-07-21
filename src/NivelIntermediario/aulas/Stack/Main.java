package NivelIntermediario.aulas.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Array
        //Sao estaticos e tem referencia de memoria
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Uzumaki Naurto";

        //List
        //Sao dinamicas e tamanho aumenta e diminui conforme precisar
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Uzumaki Naruto");


        //Stack
        //o ultimo elemento que entrou e obrigatoriamente o primeiro a sair
        Stack<String> ninjasStack = new Stack<>();
        //Adicionando ninjas na Stack (push)
        ninjasStack.push("Uzumaki Naruto");
        ninjasStack.push("Uchiha Sasuke");
        ninjasStack.push("Haruno Sakura");
        ninjasStack.push("Hyuga Hinata");
        ninjasStack.push("Hatake Kakashi");
        //O ninja no topo da lista é o Kakashi
        System.out.println("Minha Stakc Atual = " + ninjasStack);
        //Removendo o ultimo ninja adicionado (pop)
        ninjasStack.pop(); //Kakashi é removido
        //Agora o ninja no topo da lista é a Hinata
        System.out.println("Minha Stakc Atual com POP = " + ninjasStack);
        System.out.println("Minha Stakc Atual com PEEK = " + ninjasStack.peek());
        //Removendo mais um ninja
        ninjasStack.pop();
        //Agora o ninja no topo da lista é a Sakura
        System.out.println("Minha Stakc Atual = " + ninjasStack);
        System.out.println("Tamanho da stack = " + ninjasStack.size() + " elementos");
    }
}
