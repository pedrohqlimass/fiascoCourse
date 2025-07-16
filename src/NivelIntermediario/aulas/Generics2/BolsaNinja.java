package NivelIntermediario.aulas.Generics2;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    //Inicializar Array
    private List<T> ferramentas;

    //Construtor


    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    //Colocar ferramentas no Array
    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    //Mostrar a lista de ferramentas
    public void mostrarFerramentas(){
        for (T ferramenta : ferramentas){
            System.out.println(ferramenta);
        }
    }
}
