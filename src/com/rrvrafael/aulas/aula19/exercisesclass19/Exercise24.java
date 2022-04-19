package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Scanner;

public class Exercise24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        boolean palindromo = true;

        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Digite um valor para o vetor A:");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0, j = vetorA.length - 1; i < (vetorA.length / 2); i++, j--)
        {
            if (vetorA[i] != vetorA[j])
            {
                palindromo = false;
                break;
            }
        }

        System.out.println("\nELementos do vetor A:");

        for (int vetor: vetorA)
        {
            System.out.print(vetor + " ");
        }

        if (palindromo)
        {
            System.out.println("\n\nO vetor A é palíndromo.");
        }
        else
        {
            System.out.println("\n\nO vetor A não é palíndromo.");
        }
    }
}