package NivelIntermediario.desafios.desafio04;

public class Main {
    public static void main(String[] args) {

        NinjaBasico shikamaru = new NinjaBasico("Nara Shikamaru", 25, "Kagemane no Jutsu", tipoHabilidade.NINJUTSU);
        shikamaru.mostrarInformacoes();
        shikamaru.executarHabilidade();
        shikamaru.mostrarTipoHabilidade();

        System.out.println("-------");

        NinjaAvancado naruto = new NinjaAvancado("Uzumaki Naruto", 24, "Rasengan", "Ōdama Rasengan", tipoHabilidade.NINJUTSU);
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();
        naruto.mostrarTipoHabilidade();

        System.out.println("-------");

        MaitoGai gai = new MaitoGai("Maito Gai", 35, "Hirudora", "Yagai", tipoHabilidade.TAIJUTSU);
        gai.mostrarInformacoes();
        gai.executarHabilidade();
        gai.mostrarTipoHabilidade();
    }
}