package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise28 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numPrimo, countDivisores = 0;

        System.out.println("Informe um número inteiro:");
        numPrimo = scan.nextInt();

        for (int i = 1; i <= numPrimo; i++)
        {
            if (numPrimo % i == 0)
            {
                countDivisores++;
            }

            if (countDivisores > 2)
            {
                break;
            }
        }

        if (countDivisores == 2)
        {
            System.out.println("O número informado é primo!");
        }
        else
        {
            System.out.println("O número informado não é primo!");
        }
    }
}