package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Random;

public class Exercise29 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[20];
        int j = 0;

        System.out.println("Valores A | B:");

        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = random.nextInt(100);
            vetorB[i] = random.nextInt(100);

            System.out.println(vetorA[i] + " | " + vetorB[i]);
        }

        System.out.println("\nValores do vetor C:");

        for (int i = 0; i < vetorC.length; i++)
        {
            if (i < (vetorC.length / 2))
            {
                vetorC[i] = vetorA[i];
            }
            else
            {
                vetorC[i] = vetorB[j];
                j++;
            }

            System.out.print(vetorC[i] + " ");
        }
    }
}