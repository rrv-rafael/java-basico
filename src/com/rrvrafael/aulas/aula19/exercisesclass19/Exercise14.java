package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0, countImpar = 0;
        double media;

        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Digite os valores para o vetor A:");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 != 0)
            {
                soma += vetorA[i];
                countImpar++;
            }
        }

        media = (double) soma / countImpar;

        System.out.println("\nElementos do vetor A:");

        for (int vetor: vetorA)
        {
            System.out.print(vetor + " ");
        }

        System.out.println("\n\nSoma dos números ímpares: " + soma);
        System.out.println("\nMédia dos números ímpares: " + media);
    }
}