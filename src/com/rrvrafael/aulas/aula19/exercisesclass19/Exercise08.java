package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Digite os valores para o vetor A:");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++)
        {
            System.out.println("Digite os valores para o vetor B:");
            vetorB[i] = scan.nextInt();
        }

        System.out.println("vetorA * vetorB = vetorC");

        for (int i = 0; i < vetorC.length; i++)
        {
            vetorC[i] = vetorA[i] * vetorB[i];
            System.out.println(vetorA[i] + " * " + vetorB[i] + " = " + vetorC[i]);
        }
    }
}