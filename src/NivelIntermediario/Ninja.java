package NivelIntermediario;

public class Ninja {

    String nome;
    String aldeia;
    int idade;
    /*
    * O metodo VOID nao retorna nenhum valor
    * */
    //Criar uma metodo Publico personalizado
    public void SharinganAtivado(){
        System.out.println("O Sharingan Ativou!");
    }

    /*
    * Metodo String vai ter que retornar um STRING
    * */
    public String euSouUmNinja(){
        return "Oi eu sou um Ninja";
    }
    /*
    * Metodo int vai ter que retornan um INT
    * */

    public int anosParaSeTornarHokage(int idadeMininaParaSerHokage){
        return idadeMininaParaSerHokage - idade;
    }
}
