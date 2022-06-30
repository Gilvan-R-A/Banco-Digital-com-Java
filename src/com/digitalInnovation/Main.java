package com.digitalInnovation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cliente cliente = new Cliente();
        int opcao;
        double valor;
        System.out.println("Informe o nome do cliente");
        cliente.setNome(ler.next());
        System.out.println("Informe qual tipo de conta quer abrir:");
        System.out.println("Digite: \n 1 - conta corrente\n 2 -" +
                " conta poupança \n 3 - conta corrente e poupança");

        opcao = ler.nextInt();

        switch (opcao){
            case 1:
                Conta cc = new ContaCorrente(cliente);
                System.out.println("Informe o valor do depósito na conta corrente: ");
                valor = ler.nextDouble();
                cc.depositar(valor);
                cc.imprimirExtrato();
                break;
            case 2:
                Conta poupanca = new ContaPoupanca(cliente);
                System.out.println("Informe o valor do depósito na conta poupança: ");
                valor = ler.nextDouble();
                poupanca.depositar(valor);
                poupanca.imprimirExtrato();
                break;
            case 3:
                Conta cc1 = new ContaCorrente(cliente);
                System.out.println("Informe o valor do depósito na conta corrente: ");
                valor = ler.nextDouble();
                cc1.depositar(valor);
                Conta poupanca1 = new ContaPoupanca(cliente);
                System.out.println("Informe o valor do depósito na conta poupança: ");
                valor = ler.nextDouble();
                poupanca1.depositar(valor);
                cc1.imprimirExtrato();
                poupanca1.imprimirExtrato();
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
