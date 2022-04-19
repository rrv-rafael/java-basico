package com.rrvrafael.aulas.aula15.exercisesclass15;

import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ano;

        System.out.println("Digite um número correspondente ao ano:");
        ano = scan.nextInt();

        if ((ano % 400 == 0) || (ano % 100 != 0 && ano % 4 == 0))
        {
            System.out.println(ano + " é um ano bissexto!");
        }
        else
        {
            System.out.println(ano + " não é um ano bissexto!");
        }
    }
}