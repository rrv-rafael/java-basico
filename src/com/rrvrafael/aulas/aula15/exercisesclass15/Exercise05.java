package com.rrvrafael.aulas.aula15.exercisesclass15;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Digite a 1a nota:");
        nota1 = scan.nextDouble();
        System.out.println("Digite a 2a nota:");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media == 10)
        {
            System.out.println("Aprovado com Distinção!");
        }
        else if (media >= 7)
        {
            System.out.println("Aprovado!");
        }
        else
        {
            System.out.println("Reprovado!");
        }
    }
}