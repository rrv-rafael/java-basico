package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, fatorial = 1;

        System.out.println("Informe o número que deseja obter o fatorial:");
        numero = scan.nextInt();

        for (int i = 1; i <= numero; i++)
        {
            fatorial *= i;
            System.out.println(fatorial);
        }

        System.out.println("Fatorial do número " + numero + ": " + fatorial);
    }
}