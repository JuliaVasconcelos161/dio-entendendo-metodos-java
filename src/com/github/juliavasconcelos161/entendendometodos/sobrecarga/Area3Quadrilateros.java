package com.github.juliavasconcelos161.entendendometodos.sobrecarga;

public class Area3Quadrilateros {

    public static double area(double lado) {
        return lado*lado;
    }

    public static double area(double altura, double base) {
        return base * altura;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor)*altura)/2;
    }
}
