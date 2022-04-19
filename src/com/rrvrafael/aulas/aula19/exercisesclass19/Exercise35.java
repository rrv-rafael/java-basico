package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Random;

public class Exercise35 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] vetorA = new int[10];

        System.out.println("Relação dos números gerados para o vetor A:");

        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = random.nextInt(20) + 1;

            System.out.print(vetorA[i] + " ");
        }

        for (int vetor: vetorA)
        {
            System.out.println("\n\nTodos os divisores do número " + vetor + ":");

            for (int i = 1; i <= vetor; i++)
            {
                if (vetor % i == 0)
                {
                    System.out.print(i + " ");
                }
            }
        }
    }
}