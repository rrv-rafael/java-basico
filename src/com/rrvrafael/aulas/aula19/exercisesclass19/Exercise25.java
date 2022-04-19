package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Random;
import java.util.Scanner;

public class Exercise25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        Random random = new Random();

        System.out.println("Valores do vetor A:");

        for (int i = 0; i < vetorA.length; i++)
        {
            //System.out.println("Digite um valor para o vetor A:");
            //vetorA[i] = scan.nextInt();

            //vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;

            vetorA[i] = random.nextInt(100);

            if (vetorA[i] % 2 == 0)
            {
                vetorB[i] = 1;
            }
            else
            {
                vetorB[i] = 0;
            }

            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nValores do vetor B:");

        for (int vetor: vetorB)
        {
            System.out.print(vetor + " ");
        }
    }
}