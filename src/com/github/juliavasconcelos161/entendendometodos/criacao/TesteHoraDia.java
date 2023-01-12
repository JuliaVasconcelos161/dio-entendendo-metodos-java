package com.github.juliavasconcelos161.entendendometodos.criacao;

//A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa Tarde e Boa noite

import java.util.Scanner;

public class TesteHoraDia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as horas do dia (horário militar):");
        int horaDia = sc.nextInt();

        System.out.println(HoraDoDia.obterMensagem(horaDia));
    }
}
