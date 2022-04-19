package com.rrvrafael.aulas.aula15.exercisesclass15;

import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2, n3, maior;

        System.out.println("Informe o 1o número:");
        n1 = scan.nextInt();
        System.out.println("Informe o 2o número:");
        n2 = scan.nextInt();
        System.out.println("Informe o 3o número:");
        n3 = scan.nextInt();

        maior = n1;

        if (n2 > maior)
        {
            maior = n2;
        }
        if (n3 > maior)
        {
            maior = n3;
        }
        System.out.println(maior + " é o maior número digitado!");

        /*if (n1 > n2 && n1 > n3)
        {
            System.out.println("O número " + n1 + " é o maior número informado.");
        }
        else if (n2 > n1 && n2 > n3)
        {
            System.out.println("O número " + n2 + " é o maior número informado.");
        }
        else
        {
            System.out.println("O número " + n3 + " é o maior número informado.");
        }*/
    }
}