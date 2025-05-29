package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        //Criar Ninja Naruto
        Ninja narutoUzumaki = new Ninja();
        narutoUzumaki.nome = "Naruto Uzumaki";
        narutoUzumaki.aldeia = "Aldeia da Folha";
        narutoUzumaki.idade = 17;

        //Criar Ninja Sasuke
        Ninja sasukeUchiha = new Ninja();
        sasukeUchiha.nome = "Sasuke Uchiha";
        sasukeUchiha.aldeia = "Aldeia da Folha";
        sasukeUchiha.idade = 27;
        //Aplicando metodo ao objeto
        sasukeUchiha.SharinganAtivado();
        String chamandoMetodo = sasukeUchiha.euSouUmNinja();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = sasukeUchiha.anosParaSeTornarHokage(60);
        System.out.println("Você tem: " + sasukeUchiha.idade + " anos \nfaltam no minimo: " + quantoTempoFalta + " anos para voce se tornar hokage.");

        //Criar Sakura
        Ninja sakuraHaruno = new Ninja();
        sakuraHaruno.nome = "Sakura Haruno";
        sakuraHaruno.aldeia = "Aldeia da Folha";
        sakuraHaruno.idade = 19;

    }
}
