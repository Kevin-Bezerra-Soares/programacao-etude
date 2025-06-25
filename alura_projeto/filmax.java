package alura_projeto;

public class filmax {
    public static void main(String[] args) {
        clear.limpar();

        film eOVentoLevou = new film();
        eOVentoLevou.nome = "E o Vento Levou";
        eOVentoLevou.anoDeLancamento = 1939;
        eOVentoLevou.duracaoEmMinutos = 238;
        eOVentoLevou.genero = "Romance/Guerra";
        eOVentoLevou.avaliacao = 8.2;
        eOVentoLevou.diretor = "Victor Fleming";
        eOVentoLevou.musica = "Max Steiner";
        eOVentoLevou.prime = true;
        eOVentoLevou.totalDeAvaliacoes = 348000;

        System.out.println(eOVentoLevou.nome);

    }
}
