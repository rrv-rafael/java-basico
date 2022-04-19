package com.rrvrafael.aulas.aula35;

import java.util.Scanner;

public class TesteRecursao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Digite um número:");
        num = scan.nextInt();

        System.out.println(Recursao.fatorial(num));
    }
}
