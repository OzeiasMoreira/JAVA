package ALURA.PARTE2.screenmatch;

public class principal {
    public static void main(String[] args) {
        filme meuFilme = new filme();
        meuFilme.nome = "Blade";
        meuFilme.anoDeLançamento = 1998;
        meuFilme.duraçaoFilme = 120;

        System.out.println(meuFilme.nome);

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(8);
        meuFilme.avaliar(7);
        meuFilme.avaliar(9);
        System.out.println(meuFilme.somaDasAvaliaçoes);
        System.out.println(meuFilme.totalAvaliaçoes);
        System.out.println(meuFilme.mediaAvaliaçoes());
    }
}
