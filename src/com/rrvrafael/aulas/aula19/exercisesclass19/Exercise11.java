package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int countPar = 0;

        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Digite um valor para o vetor A:");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0)
            {
                countPar++;
            }
        }

        if (countPar > 1)
        {
            System.out.println("O vetor A tem " + countPar + " números pares.");
        }
        else
        {
            System.out.println("O vetor A tem " + countPar + " número par.");
        }
    }
}