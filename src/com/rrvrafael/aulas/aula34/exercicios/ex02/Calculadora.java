package com.rrvrafael.aulas.aula34.exercicios.ex02;

public class Calculadora {
    public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    public static int subtrair(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    public static double dividir(double n1, double n2) {
        return n1 / n2;
    }

    public static int potencia(int n1, int n2) {
        int resultado = 1;

        for (int i = 0; i < n2; i++) {
            resultado *= n1;
        }

        return resultado;
    }
}
