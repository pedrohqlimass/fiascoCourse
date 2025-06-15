package NivelIntermediario.aulas.Contrutores;

public class Main {
    public static void main(String[] args) {

        Hokage hashirama = new Hokage();
        hashirama.nome = "Senju Hashirama";

        Hokage tobirama = new Hokage("Senji Tobirama");
        System.out.println(tobirama.nome);

        Hokage hiruzen = new Hokage(40);

        Hokage minato = new Hokage("Namikaze Minato", false);

        Hokage tsunade = new Hokage("Tsunade", 40, true, "Aldeia da Folha", 1000, 897.786, 1.78);

    }
}
