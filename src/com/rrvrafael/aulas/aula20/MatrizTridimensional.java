package com.rrvrafael.aulas.aula20;

public class MatrizTridimensional {

    public static void main(String[] args) {

        int[][][] matrizTridimensional = new int[3][3][3];
        int somaTotal = 0, somaPar = 0, somaImpar = 0;


        for (int i = 0; i < matrizTridimensional.length; i++)
        {
            for (int j = 0; j < matrizTridimensional[i].length; j++)
            {
                for (int k = 0; k < matrizTridimensional[i][j].length; k++)
                {
                    //System.out.println(matrizTridimensional[i][j].length);
                    matrizTridimensional[i][j][k] = (i + j + k);
                    somaTotal += matrizTridimensional[i][j][k];
                    //System.out.println(i + " + " + j + " + " + k + " = " + (i + j + k));
                    //System.out.println(matrizTridimensional[i][j][k]);

                    if (matrizTridimensional[i][j][k] % 2 == 0)
                    {
                        somaPar += matrizTridimensional[i][j][k];
                    }
                    else
                    {
                        somaImpar += matrizTridimensional[i][j][k];
                    }
                }
            }
        }

        System.out.println("Soma total: " + somaTotal);
        System.out.println("Soma dos números pares: " + somaPar);
        System.out.println("Soma dos números ímpares: " + somaImpar);
    }
}