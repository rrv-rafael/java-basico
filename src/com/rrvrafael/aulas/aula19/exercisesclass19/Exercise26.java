package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Random;

public class Exercise26 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        System.out.println("Valores de A | B:");

        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = random.nextInt(100);
            vetorB[i] = random.nextInt(100);

            if (vetorA[i] > vetorB[i])
            {
                vetorC[i] = 1;
            }
            else if (vetorA[i] == vetorB[i])
            {
                vetorC[i] = 0;
            }
            else
            {
                vetorC[i] = -1;
            }

            if (vetorA[i] < 10)
            {
                System.out.println(vetorA[i] + "  | " + vetorB[i]);
            }
            else
            {
                System.out.println(vetorA[i] + " | " + vetorB[i]);
            }

        }

        System.out.println("\nValores do vetor C:");

        for (int vetor: vetorC)
        {
            System.out.print(vetor + " ");
        }
    }
}