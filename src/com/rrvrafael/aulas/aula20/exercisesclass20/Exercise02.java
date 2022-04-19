package com.rrvrafael.aulas.aula20.exercisesclass20;

import java.util.Random;

public class Exercise02 {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] matrizRandom = new int[10][10];
        int maiorLinha, menorLinha, maiorColuna, menorColuna;

        for (int i = 0; i < matrizRandom.length; i++)
        {
            for (int j = 0; j < matrizRandom[i].length; j++)
            {
                matrizRandom[i][j] = random.nextInt(10);
                System.out.print(matrizRandom[i][j] + " ");
            }

            System.out.println();
        }

        maiorLinha = matrizRandom[0][0];
        menorLinha = matrizRandom[0][0];
        maiorColuna = matrizRandom[0][0];
        menorColuna = matrizRandom[0][0];

        System.out.println();

        for (int j = 0; j < matrizRandom[5].length; j++)
        {
            if (matrizRandom[5][j] > maiorLinha)
            {
                maiorLinha = matrizRandom[5][j];
            }

            if (matrizRandom[5][j] < menorLinha)
            {
                menorLinha = matrizRandom[5][j];
            }
        }

        for (int[] matriz : matrizRandom)
        {
            if (matriz[7] > maiorColuna)
            {
                maiorColuna = matriz[7];
            }

            if (matriz[7] < menorColuna)
            {
                menorColuna = matriz[7];
            }
        }

        System.out.println("\nMaior valor da linha 5: " + maiorLinha + "\nMenor valor da linha 5: " + menorLinha);
        System.out.println("Maior valor da coluna 7: " + maiorColuna + "\nMenor valor da coluna 7: " + menorColuna);
    }
}