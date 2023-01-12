package com.github.juliavasconcelos161.entendendometodos.criacao;

public class Emprestimo {
    private static double taxa2Parcelas = 0.25;
    private static double taxa4Parcelas = 0.5;


    public static double getTaxa2Parcelas() {
        return taxa2Parcelas;
    }

    public static double getTaxa4Parcelas() {
        return taxa4Parcelas;
    }

    private static double acrescimo2Parcelas(double valor) {
        return valor * taxa2Parcelas;
    }

    private static double acrescimo4Parcelas(double valor) {
        return valor * taxa4Parcelas;
    }

    public static double calculoEmprestimo(int quantidadeParcelas, double valor){
        switch(quantidadeParcelas) {
            case 1:
            {
                return valor;
            }
            case 2:
            {
                return valor+= acrescimo2Parcelas(valor);
            }
            case 4:
            {
                return valor+= acrescimo4Parcelas(valor);
            }
            default:
            {
                throw new IllegalArgumentException("Quantidade de parcelas inválida.");
            }
        }
    }

}
