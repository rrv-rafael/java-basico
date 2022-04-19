package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, soma = 1, numAnterior = 1, flag = 0, count = 0;

        //Preciso refazer direitinho

        System.out.println("Digite um número:");
        numero = scan.nextInt();

        System.out.println("Série de Fibonacci:");

        while (count < numero)
        {
            System.out.println(soma);
            soma += flag;
            flag = numAnterior;
            numAnterior = soma;
            count++;
        }

        System.out.println("Soma da série de Fibonacci: " + soma);
    }
}