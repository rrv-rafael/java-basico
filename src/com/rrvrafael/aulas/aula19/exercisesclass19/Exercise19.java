package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] notas1 = new double[10];
        double[] notas2 = new double[10];
        double[] medias = new double[10];

        for (int i = 0; i < notas1.length; i++)
        {
            System.out.println("Digite a nota 1:");
            notas1[i] = scan.nextDouble();

            System.out.println("Digite a nota 2:");
            notas2[i] = scan.nextDouble();

            medias[i] = (notas1[i] + notas2[i]) / 2;
        }

        System.out.println("\nNotas 1:");

        for (double notas: notas1)
        {
            System.out.print(notas + " ");
        }

        System.out.println("\n\nNotas 2:");

        for (double notas: notas2)
        {
            System.out.print(notas + " ");
        }

        System.out.println("\n\n");

        for (int i = 0; i < medias.length; i++)
        {
            if (medias[i] >= 7)
            {
                System.out.println("Média: " + (i + 1) + " | " + (medias[i]) + " - Aprovado");
            }
            else
            {
                System.out.println("Média: " + (i + 1) + " | " + (medias[i]) + " - Reprovado");
            }
        }
    }
}