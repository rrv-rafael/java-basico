package com.rrvrafael.aulas.aula19.exercisesclass19;

public class Exercise22 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int countZero = 0, countUm = 0;
        double percentZero, percentUm;

        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = (int) Math.round(Math.random() * 1);

            if (vetorA[i] == 1)
            {
                countUm++;
            }
            else
            {
                countZero++;
            }
        }

        System.out.println("Quantidade de número 1: " + countUm);
        System.out.println("Quantidade de número 0: " + countZero);

        //percentUm = ((double) countUm / vetorA.length) * 100;
        //percentZero = ((double) countZero / vetorA.length) * 100;
        percentUm = (double) (countUm * 100) / vetorA.length;
        percentZero = (double) (countZero * 100) / vetorA.length;

        System.out.println("\nElementos do vetor A:");

        for (int vetor: vetorA)
        {
            System.out.print(vetor + " ");
        }

        System.out.println("\n\n" + percentUm + "% dos números são 1.");
        System.out.println(percentZero + "% dos números são 0.");


    }
}