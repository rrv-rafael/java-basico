package com.rrvrafael.aulas.aula35;

public class Recursao {
    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        }

        return num * fatorial(num - 1);
    }
}
