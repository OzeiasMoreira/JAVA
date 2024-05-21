package UENP.spamdetector;

public class Main {

    public static void main(String[] args) {

        LeitorArquivo leitorArquivo = new LeitorArquivo();
        String mensagem = leitorArquivo.lerArquivo
        ("C:\\Users\\Ozeias\\Documents\\NetBeansProjects\\Prog_II\\src\\main\\java\\spamdetector\\termos.txt");
        System.out.println(SpamDetector.calcularScore(mensagem));

    }
}
