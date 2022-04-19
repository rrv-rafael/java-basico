package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Random;

public class Exercise31 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] vetorA = new int[20];
        int[] vetorB = new int[20];
        int count = 0;

        System.out.println("Valores do vetor A:");

        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = random.nextInt(100);

            if (vetorA[i] % 2 == 0)
            {
                vetorB[count] = vetorA[i];
                count++;
            }

            System.out.print(vetorA[i] + " ");
        }

        for (int vetor: vetorA)
        {
            if (vetor % 2 != 0)
            {
                vetorB[count] = vetor;
                count++;
            }
        }

        System.out.println("\n\nValores do vetor B:");

        for (int vetor: vetorB)
        {
            System.out.print(vetor + " ");
        }
    }
}