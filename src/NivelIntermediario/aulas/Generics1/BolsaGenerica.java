package NivelIntermediario.aulas.Generics1;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamento;

    public BolsaGenerica() {
        this.equipamento = new ArrayList<>();
    }

    public BolsaGenerica(List<T> equipamentos) {
        this.equipamento = equipamentos;
    }

    //Adicionar equipamentos genéricos
    public void adicionarEquipamentos(T equipamentoGenerico){
        equipamento.add(equipamentoGenerico);
    }

    public List<T> getEquipamentos() {
        return equipamento;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamento = equipamentos;
    }

    @Override
    public String toString(){
        return "Bolsa de equipamentos: " + equipamento.toString();
    }
}
