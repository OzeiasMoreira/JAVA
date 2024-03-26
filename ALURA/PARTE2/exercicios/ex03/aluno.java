package ALURA.PARTE2.exercicios.ex03;

public class aluno {
    String nome;
    int idade;
    double somaNotas;
    int totalNotas;

    void avaliar(double nota){
        somaNotas += nota;
        totalNotas++;
    }

    double media(){
        
        return somaNotas / totalNotas;

    }

    void exibir(){

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
        
    }
}
