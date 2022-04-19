package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Random;

public class Exercise27 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] vetorA = new int[10];
        char[] vetorB = new char[10];

        System.out.println("Valores do vetor A:");

        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = random.nextInt(100);

            if (vetorA[i] < 7)
            {
                vetorB[i] = 'a';
            }
            else if (vetorA[i] == 7)
            {
                vetorB[i] = 'b';
            }
            else if (vetorA[i] > 7 && vetorA[i] < 10)
            {
                vetorB[i] = 'c';
            }
            else if (vetorA[i] == 10)
            {
                vetorB[i] = 'd';
            }
            else
            {
                vetorB[i] = 'e';
            }

            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\n\nValores do vetor C:");

        for (char vetor: vetorB)
        {
            System.out.print(vetor + " ");
        }
    }
}