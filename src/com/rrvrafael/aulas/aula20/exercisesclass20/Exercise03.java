package com.rrvrafael.aulas.aula20.exercisesclass20;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] numeros = new int[3][3];
        int countPar = 0, countImpar = 0;

        for (int i = 0; i < numeros.length; i++)
        {
            for (int j = 0; j < numeros[i].length; j++)
            {
                System.out.println("Digite um valor para a matriz:");
                numeros[i][j] = scan.nextInt();

                if (numeros[i][j] % 2 == 0)
                {
                    countPar++;
                }
                else
                {
                    countImpar++;
                }
            }
        }

        System.out.println();

        for (int[] matrizI : numeros)
        {
            for (int matrizJ : matrizI)
            {
                System.out.print(matrizJ + " ");
            }
            System.out.println();
        }

        System.out.println("\nA quantidade de números pares nesta matriz é: " + countPar);
        System.out.println("A quantidade de números ímpares nesta matriz é: " + countImpar);
    }
}