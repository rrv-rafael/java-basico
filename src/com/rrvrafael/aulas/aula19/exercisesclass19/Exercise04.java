package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[15];

        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Digite um valor:");
            vetorA[i] = scan.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        DecimalFormat formato = new DecimalFormat("###,###.###");

        System.out.println("\nValores do vetor A:");

        for (int vetor: vetorA)
        {
            System.out.print(vetor + " ");
        }

        System.out.println("\n\nValores do vetor B:");

        for (double vetor: vetorB)
        {
            System.out.print(formato.format(vetor) + " ");
        }
    }
}