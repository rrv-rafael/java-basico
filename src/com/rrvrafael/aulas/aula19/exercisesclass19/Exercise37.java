package com.rrvrafael.aulas.aula19.exercisesclass19;

public class Exercise37 {

    public static void main(String[] args) {

        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        System.out.println("Elementos do vetor A:");

        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = i + 1;

            System.out.print(vetorA[i] + " ");

            //vetorB[i] = vetorA[i];
            vetorB[i] = 1;

            for (int j = 2; j <= vetorA[i]; j++)
            {
                vetorB[i] *= j;
            }
        }

        System.out.println("\n\nElementos do vetor B:");

        for (int vetor: vetorB)
        {
            System.out.print(vetor + " ");
        }
    }
}