package com.github.juliavasconcelos161.entendendometodos.criacao;


public class HoraDoDia {

    public static String obterMensagem(int horaDia) {
        switch (horaDia) {
            case 4, 5, 6, 7, 8, 9, 10, 11, 12: {
                return mensagemBomDia();
            }
            case 13, 14, 15, 16, 17, 18: {
                return mensagemBoaTarde();
            }
            case 19, 20, 21, 22, 23, 0, 1, 2, 3: {
                return mensagemBoaNoite();
            }
            default: {
                return "Insira apenas as horas em horário militar.";
            }
        }
    }

    private static String mensagemBomDia() {
        return "Bom dia!";
    }

    private static String mensagemBoaTarde() {
        return "Boa tarde!";
    }

    private static String mensagemBoaNoite() {
        return "Boa noite!";
    }

}
