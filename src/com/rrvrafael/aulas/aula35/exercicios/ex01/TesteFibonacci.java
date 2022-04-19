package com.rrvrafael.aulas.aula35.exercicios.ex01;

import java.util.Scanner;

public class TesteFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.println("Digite um valor:");
        n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(Fibonacci.sequenciaFibonacci(i) + " ");
        }
    }
}
