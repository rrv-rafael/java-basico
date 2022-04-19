package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Random;

public class Exercise28 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        System.out.println("Valores do vetor A:");

        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = random.nextInt(100);
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\n\nValores do vetor B:");

        for (int i = 0, j = vetorB.length - 1; i < vetorA.length; i++, j--)
        {
            vetorB[j] = vetorA[i];
        }

        for (int vetor: vetorB)
        {
            System.out.print(vetor + " ");
        }
    }
}