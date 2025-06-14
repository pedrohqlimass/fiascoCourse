package NivelIntermediario.aulas.HerancaEInterfaces;

public class Main {
    public static void main(String[] args) {

        //Ninja Naruto Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Uzumaki Naruto";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 18;
        naruto.modoSabioAtivado();

        //Ninja Sasuke Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Uchiha Sasuke";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.SharinganAtivado();

        //Ninja Sakura Haruno
        Haruno sakura = new Haruno();
        sakura.nome = "Haruno Sakura";
        sakura.aldeia = "Aldeia da Folha";
        sakura.idade = 18;
        sakura.AtivarCura();

        //Ninja Hyuga Hinata
        Hyuga hinata = new Hyuga();
        hinata.nome = "Hyuga Hinata";
        hinata.aldeia = "Aldeia da Folha";
        hinata.idade = 18;
        hinata.AtivarByakugan();

        //Ninja Hyuga Uzumaki Boruto
        Boruto boruto = new Boruto();
        boruto.nome = "Huyga Uzumaki Boruto";
        boruto.aldeia = "Aldeia da Folha";
        boruto.idade = 18;

        boruto.modoSabioAtivado();
        boruto.ativarKarma();
        boruto.ativarJougan();


    }
}
