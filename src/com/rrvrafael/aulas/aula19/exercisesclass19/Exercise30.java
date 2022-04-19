package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Random;

public class Exercise30 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] vetorA = new int[20];
        int[] vetorB, vetorC;
        int countPar = 0, countImpar = 0;

        System.out.println("Valores do vetor A:");

        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = random.nextInt(100);

            if (vetorA[i] % 2 == 0)
            {
                countPar++;
            }
            else
            {
                countImpar++;
            }

            System.out.print(vetorA[i] + " ");
        }

        vetorB = new int[countPar];
        vetorC = new int[countImpar];

        countPar = 0;
        countImpar = 0;

        for (int vetor: vetorA)
        {
            if (vetor % 2 == 0)
            {
                vetorB[countPar] = vetor;
                countPar++;
            }
            else
            {
                vetorC[countImpar] = vetor;
                countImpar++;
            }
        }

        System.out.println("\n\nValores do vetor B:");

        for (int vetor: vetorB)
        {
            System.out.print(vetor + " ");
        }

        System.out.println("\n\nValores do vetor C:");

        for (int vetor: vetorC)
        {
            System.out.print(vetor + " ");
        }
    }
}