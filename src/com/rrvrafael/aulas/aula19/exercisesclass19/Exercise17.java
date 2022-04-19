package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];
        int count = 0;

        for (int i = 0; i < idades.length; i++)
        {
            System.out.println("Digite uma idade:");
            idades[i] = scan.nextInt();

            if (idades[i] > 35)
            {
                count++;
            }
        }

        System.out.println("\nElementos do vetor idade: ");

        for (int idade: idades)
        {
            System.out.print(idade + " ");
        }

        System.out.println("\n\n" + count + " pessoa(s) possuem idade superior a 35 anos.");
    }
}