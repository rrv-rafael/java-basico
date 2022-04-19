package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int base, expoente, count = 1, resultado;

        System.out.println("Digite o valor da base:");
        base = scan.nextInt();

        System.out.println("Digite o valor do expoente:");
        expoente = scan.nextInt();

        resultado = base;

        while (count < expoente)
        {
            resultado *= base;
            count++;
        }

        System.out.println("Resultado da potência: " + resultado);
    }
}