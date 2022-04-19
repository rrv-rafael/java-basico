package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Random;

public class Exercise34 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] vetorA = new int[10];

        System.out.println("Elementos gerados para o vetor A:");

        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = random.nextInt(100) + 1;

            System.out.print(vetorA[i] + " ");
        }

        for (int vetor: vetorA)
        {
            System.out.println("\n\nRelação de todos os pares de 0 até o elemento " + vetor + ":");

            for (int i = 2; i <= vetor; i++)
            {
                if (i % 2 == 0)
                {
                    System.out.print(i + " ");
                }
            }
        }
    }
}