package com.github.juliavasconcelos161.entendendometodos.criacao;

import java.util.Scanner;
//Calcule o valor final de um emprestino a partir do valor solicitado

public class TesteEmprestimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do emprestimo: ");
        double valor = sc.nextDouble();

        if(valor > 0) {
            System.out.println("Insira em quantas parcelas deseja pagar o empréstimo:");
            System.out.println("Digite 1 - para uma parcela - taxa 0");
            System.out.println("Digite 2 - para duas parcelas - taxa " + Emprestimo.getTaxa2Parcelas());
            System.out.println("Digite 4 - para quatro parcelas - taxa " + Emprestimo.getTaxa4Parcelas());
            int numeroParcelas = sc.nextInt();

            try {
                System.out.println("O valor a ser pago é R$" + Emprestimo.calculoEmprestimo(numeroParcelas, valor));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        else {
            System.out.println("Valor inválido");
        }

    }
}
