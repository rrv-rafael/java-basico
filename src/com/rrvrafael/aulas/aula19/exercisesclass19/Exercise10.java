package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Digite os valores para o vetor A:");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] % 2;
        }

        for (int i = 0; i < vetorB.length; i++)
        {
            System.out.print("VetorA[" + i + "]: " + vetorA[i] + " | ");
            System.out.println("VetorB[" + i + "]: " + vetorB[i]);
        }
    }
}