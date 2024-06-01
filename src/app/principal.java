package app;

import entidades.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Criação de uma nova cona bancária
        //Entrada do Usuário
        System.out.print("Digite o nome do titular da conta: ");
        String titular = sc.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        //Entrada do construtor titular e saldoInicial
        ContaBancaria conta = new ContaBancaria(titular, saldoInicial);

        //Menu de operações
        int escolha; //Armazena a escolha do usuário

        do { //Loop que exibe o menu e processa a escolha do usuário ate que a opcão de sair seja selecionada.
            System.out.println("\nMenu da conta bancária");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Verificar saldo");
            System.out.println("4. Sair");

            System.out.println();
            System.out.print("Digite sua escolha: ");
            escolha = sc.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("Digite a quantia para depositar: ");
                    double quantiaDeposito = sc.nextDouble();
                    conta.depositar(quantiaDeposito);
                    break;
                case 2:
                    System.out.println("Digite a quantia para sacar: ");
                    double quantiaSaque = sc.nextDouble();
                    conta.sacar(quantiaSaque);
                    break;
                case 3:
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Escolha inválida. Por favor, tente novamente.");
            }
        }
        while (escolha != 4);

                sc.close();
    }
}
