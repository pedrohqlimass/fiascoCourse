package NivelIntermediario.treinos.treino4;

import java.util.List;

public class CadastroClientes<T> {

    /*
     * Inicializando ArrayList
     * */
    final List<T> clientes;

    /*
     * Construtor
     * */
    public CadastroClientes(List<T> clientes) {
        this.clientes = clientes;
    }

    public void adicionarCliente(T nome) {
        clientes.add(nome);
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        }else{
            for (T nome : clientes) {
                System.out.println("- " + nome);
            }
        }
    }

    public int buscarCliente(T nome) {
        return clientes.indexOf(nome);
    }

    public void removerCliente(T nome) {
        clientes.remove(nome);
    }
}
