package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int fatorial;

        System.out.println("Digite o número inteiro que deseja calcular o fatorial:");
        fatorial = scan.nextInt();

        System.out.println("Fatorial de: " + fatorial);
        System.out.print(fatorial + "! = " + fatorial + " . ");

        for (int i = fatorial - 1; i > 1; i--)
        {
            System.out.print(i + " . ");

            fatorial *= i;
        }

        System.out.print(1 + " = " + fatorial);
    }
}