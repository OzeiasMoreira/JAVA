package ALURA.PARTE2.screenmatch;

public class filme {
    String nome;
    int anoDeLançamento;
    boolean incluidoPlano;
    double somaDasAvaliaçoes;
    int totalAvaliaçoes;
    int duraçaoFilme;

    void exibirFichaTecnica(){

        System.out.println("Nome do Filme: " + nome);
        System.out.println("O ano de lançamento é: " + anoDeLançamento);
    }

    void avaliar(double nota){
        somaDasAvaliaçoes += nota;
        totalAvaliaçoes++;

    }

    double mediaAvaliaçoes(){

        return somaDasAvaliaçoes / totalAvaliaçoes;
    }
}
