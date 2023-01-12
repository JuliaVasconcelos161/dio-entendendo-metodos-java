package com.github.juliavasconcelos161.entendendometodos.sobrecarga;

/*Crie uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio
* Utilize sobrecarga*/
public class TesteArea3Quadrilateros {
    public static void main(String[] args) {

        System.out.println("A área de um quadrado de lado 3 é " + Area3Quadrilateros.area(3));
        System.out.println("A área de um retângulo de base 2 e altura 4 é " + Area3Quadrilateros.area(2, 4));
        System.out.println("A área de um trapézio de base maior 3,  base menor 4, e altura 1 é " + Area3Quadrilateros.area(3,4,1));
    }
}
