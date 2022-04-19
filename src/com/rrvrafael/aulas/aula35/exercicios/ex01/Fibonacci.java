package com.rrvrafael.aulas.aula35.exercicios.ex01;

public class Fibonacci {
    public static int sequenciaFibonacci(int n) {
        if (n < 2) {
            return 1;
        }

        return sequenciaFibonacci(n - 1) + sequenciaFibonacci(n - 2);
    }
}
