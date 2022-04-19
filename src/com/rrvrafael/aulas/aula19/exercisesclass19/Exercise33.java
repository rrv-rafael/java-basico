package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Random;

public class Exercise33 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] vetorA = new int[10];
        boolean verificaPrimo;

        System.out.println("Números gerados para o vetor A:");

        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = random.nextInt(100) + 1;

            System.out.print(vetorA[i] + " ");
        }

        System.out.println('\n');

        for (int vetor: vetorA)
        {
            verificaPrimo = true;

            for (int i = 2; i < vetor; i++)
            {
                if (vetor % i == 0)
                {
                    verificaPrimo = false;
                    break;
                }
            }

            if (verificaPrimo)
            {
                System.out.println(vetor + " é primo!");
            }
            else
            {
                System.out.println(vetor + " não é primo!");
            }
        }
    }
}