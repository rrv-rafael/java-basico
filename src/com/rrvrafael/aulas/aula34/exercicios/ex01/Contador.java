package com.rrvrafael.aulas.aula34.exercicios.ex01;

public class Contador {
    private static int count;

    public static void incrementar() {
        count++;
    }

    public static void zerar() {
        count = 0;
    }

    public static int retornar() {
        return count;
    }
}
