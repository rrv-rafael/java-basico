package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];
        int maior, menor, posicaoMaior = 0, posicaoMenor = 0;

        for (int i = 0; i < idades.length; i++)
        {
            System.out.println("Digite uma idades:");
            idades[i] = scan.nextInt();
        }

        maior = idades[0];
        menor = idades[0];

        for (int i = 1; i < idades.length; i++)
        {
            if (idades[i] > maior)
            {
                maior = idades[i];
                posicaoMaior = i;
            }
            if (idades[i] < menor)
            {
                menor = idades[i];
                posicaoMenor = i;
            }
        }

        System.out.println("\nElementos do vetor idades:");

        for (int idade: idades)
        {
            System.out.print(idade + " ");
        }

        System.out.println("\n\nA maior idade digitada é: " + maior + " e sua posição é: " + posicaoMaior);
        System.out.println("A menor idade digitada é: " + menor + " e sua posição é: " + posicaoMenor);
    }
}