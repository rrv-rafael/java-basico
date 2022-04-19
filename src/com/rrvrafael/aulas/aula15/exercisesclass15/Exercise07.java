package com.rrvrafael.aulas.aula15.exercisesclass15;

import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2, n3, maior, menor;

        System.out.println("Informe o 1o número:");
        n1 = scan.nextInt();
        System.out.println("Informe o 2o número:");
        n2 = scan.nextInt();
        System.out.println("Informe o 3o número:");
        n3 = scan.nextInt();

        maior = n1;
        menor = n1;

        if (n2 > maior)
        {
            maior = n2;
        }
        if (n2 < menor)
        {
            menor = n2;
        }
        if (n3 > maior)
        {
            maior = n3;
        }
        if (n3 < menor)
        {
            menor = n3;
        }

        System.out.println("O número " + maior + " é o maior número digitado!");
        System.out.println("O número " + menor + " é o menor número digitado!");
    }
}