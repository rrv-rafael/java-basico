package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Random;
import java.util.Scanner;

public class Exercise32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Digite um número:");
            vetorA[i] = scan.nextInt();

            //vetorA[i] = random.nextInt(10) + 1;

            /*System.out.println("\nTabuada do número " + vetor + ":");

            for (int j = 1; j <= 10; j++)
            {
                System.out.println(vetorA[i] + " * " + j + " = " + (vetorA[i] * j));
            }*/
        }

        for (int vetor: vetorA)
        {
            System.out.println("\nTabuada do número " + vetor + ":");

            for (int j = 1; j <= 10; j++)
            {
                System.out.println(vetor + " * " + j + " = " + (vetor * j));
            }
        }
    }
}