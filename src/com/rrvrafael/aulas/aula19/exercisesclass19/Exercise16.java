package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int somaMenor = 0, somaMaior = 0, countIgual = 0, countMaior = 0;
        double media;

        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Digite um valor para o vetor A:");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] < 15)
            {
                somaMenor += vetorA[i];
            }
            else if (vetorA[i] == 15)
            {
                countIgual++;
            }
            else
            {
                somaMaior += vetorA[i];
                countMaior++;
            }
        }

        media = (double) somaMaior / countMaior;

        System.out.println("\nElementos do vetor A:");

        for (int vetor: vetorA)
        {
            System.out.print(vetor + " ");
        }

        System.out.println("\n\nSoma dos elementos armazenados no vetor A que são inferiores a 15: " + somaMenor);
        System.out.println("Quantidade de elementos armazenados no vetor A que são iguais a 15: " + countIgual);
        System.out.println("Média dos elementos armazenados no vetor A que são superiores a 15: " + media);
    }
}