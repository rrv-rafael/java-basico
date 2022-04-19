package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Digite um número:");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * 2;
        }

        System.out.println("\nValores do vetor A:");

        for (int vetor: vetorA)
        {
            System.out.print(vetor + " ");
        }

        System.out.println("\n\nValores do vetor B:");

        for (int vetor: vetorB)
        {
            System.out.print(vetor + " ");
        }
    }
}