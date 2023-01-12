package com.github.juliavasconcelos161.entendendometodos.criacao;

//Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão.
//Sempre 2 valores devem ser passados

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        System.out.println("Insira a operação desejada:");
        System.out.println("Somar");
        System.out.println("Subtrair");
        System.out.println("Multiplicar");
        System.out.println("Dividir");
        String operacao = sc.next();

        System.out.println("Insira os números que serão usados na operação:");
        double numero1 = sc.nextInt();
        double numero2 = sc.nextInt();

        switch(operacao) {
            case "somar", "Somar":
            {
                resultado = Calculadora.somar(numero1, numero2);
                break;
            }
            case "subtrair", "Subtrair": {
                resultado = Calculadora.subtrair(numero1, numero2);
                break;
            }
            case "multiplicar", "Multiplicar": {
                resultado = Calculadora.multiplicar(numero1, numero2);
                break;
            }
            case "dividir", "Dividir": {
                resultado = Calculadora.dividir(numero1, numero2);
                break;
            }
            default: {
                System.out.println("Opção indisponível");
            }
        }

        System.out.println("O resultado é " + resultado);

    }
}
