package ALURA.PARTE1.desafio;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nome = "Ozeias Moreira";
        String tipoConta = "Corrente";
        double saldo = 2000.00;

        System.out.println("*****************************");
        System.out.println("\nCliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*****************************");

        int opçao = 0;
        Scanner leitura = new Scanner(System.in);
        while (opçao != 4) {
            
            System.out.println("\nO que deseja fazer?");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Transferencia");
            System.out.println("3 - Depósito");
            System.out.println("4 - Sair");
            opçao = leitura.nextInt();

            if (opçao == 1) {
                System.out.println("Saldo: " + saldo);
            } else if (opçao == 2){
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente.");
                } else {
                    saldo -= valor;
                    System.out.println("Transferencia realizada com sucesso.");
                }
            } else if (opçao == 3){
                    System.out.println("Qual o valor que deseja depositar?");
                    double valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("Deposito realizado com sucesso.");

            } else if(opçao != 4){
                System.out.println("Opçao invalida!");
            }
        }
    }
}
