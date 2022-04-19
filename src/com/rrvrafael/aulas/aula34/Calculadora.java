package com.rrvrafael.aulas.aula34;

//Classe com sobrecarga de métodos

public class Calculadora {
    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int soma(int[] vetorInteiros) {
        int total = 0;

        for (int vetor: vetorInteiros) {
            total += vetor;
        }

        return total;
    }
}
