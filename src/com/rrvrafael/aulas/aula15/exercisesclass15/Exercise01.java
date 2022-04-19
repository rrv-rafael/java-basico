package com.rrvrafael.aulas.aula15.exercisesclass15;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2;

        System.out.println("Informe o 1o número:");
        n1 = scan.nextInt();
        System.out.println("Informe o 2o número:");
        n2 = scan.nextInt();

        if (n1 > n2)
        {
            System.out.println(n1 + " é o maior número.");
        }
        else if (n2 > n1)
        {
            System.out.println(n2 + " é o maior número.");
        }
        else
        {
            System.out.println("Os números informados são iguais!");
        }
    }
}