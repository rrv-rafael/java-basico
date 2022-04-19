package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, countPar = 0, countImpar = 0, count = 0;

        while (count < 10)
        {
            count++;

            System.out.println("Digite o " + count + "o número:");
            numero = scan.nextInt();

            if (numero % 2 == 0)
            {
                countPar++;
            }
            else
            {
                countImpar++;
            }
        }

        System.out.println("Quantidade de números pares digitados: " + countPar);
        System.out.println("Quantidade de númueros ímpares digitados: " + countImpar);
    }
}