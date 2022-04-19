package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, maiorNumero = Integer.MIN_VALUE, count = 0;

        do
        {
            count++;

            System.out.println("Digite o " + count + "o numero:");
            numero = scan.nextInt();

            if (numero > maiorNumero)
            {
                maiorNumero = numero;
            }
        }
        while (count < 5);

        System.out.println("O maior número digitado foi: " + maiorNumero);
    }
}