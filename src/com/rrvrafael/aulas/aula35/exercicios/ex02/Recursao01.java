package com.rrvrafael.aulas.aula35.exercicios.ex02;

public class Recursao01 {
    public static int somatorio(int n) {
        if (n == 1) {
            return 1;
        }

        return n + somatorio(n - 1);
    }
}
