package com.rrvrafael.aulas.aula19.exercisesclass19;

public class Exercise36 {

    public static void main(String[] args) {

        int[] vetorA = new int[11];

        System.out.println("Elementos gerados para o vetor A:");

        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = (int) Math.pow(2, i);

            System.out.print(vetorA[i] + " ");
        }
    }
}