package com.rrvrafael.aulas.aula19.exercisesclass19;

import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacaoDolar;

        System.out.println("Informe a cotação do dólar (U$) em relação ao real (R$):");
        cotacaoDolar = scan.nextDouble();

        for (int i = 1; i <= vetorA.length; i++)
        {
            vetorA[i] = cotacaoDolar * i;
            System.out.println("Valores do vetor A: " + vetorA[i]);
        }
    }
}