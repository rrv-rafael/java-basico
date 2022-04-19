package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int countImpar = 0, countPar = 0;
        double percentPar, percentImpar;


        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Digite um valor para o vetor A:");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0)
            {
                countPar++;
            }
            else
            {
                countImpar++;
            }
        }

        percentPar =  ((double) countPar / vetorA.length) * 100;
        percentImpar =  ((double) countImpar / vetorA.length) * 100;

        System.out.println(percentPar + "% dos números contidos no vetor A é par.");
        System.out.println(percentImpar + "% dos números contidos no vetor A é ímpar.");
    }
}