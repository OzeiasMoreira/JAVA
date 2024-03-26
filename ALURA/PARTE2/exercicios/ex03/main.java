package ALURA.PARTE2.exercicios.ex03;

public class main {
    public static void main(String[] args) {
        aluno aluno = new aluno();
        aluno.nome = "Ozeias Moreira";
        aluno.idade = 19;

        aluno.exibir();
        aluno.avaliar(8);
        aluno.avaliar(7);
        aluno.avaliar(4);
        aluno.avaliar(10);
        System.out.println(aluno.somaNotas);
        System.out.println(aluno.totalNotas);
        System.out.println(aluno.media());
        
    }
}
