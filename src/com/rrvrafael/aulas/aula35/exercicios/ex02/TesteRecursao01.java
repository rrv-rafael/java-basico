package com.rrvrafael.aulas.aula35.exercicios.ex02;

import java.util.Scanner;

public class TesteRecursao01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.println("Digite um valor:");
        n = scan.nextInt();

        System.out.println(Recursao01.somatorio(n));
    }
}
