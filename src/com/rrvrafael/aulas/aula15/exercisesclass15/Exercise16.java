package com.rrvrafael.aulas.aula15.exercisesclass15;

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a, b, c, delta, raiz1, raiz2;

        System.out.println("Informe o valor de a:");
        a = scan.nextDouble();

        if (a != 0)
        {
            System.out.println("Informe o valor de b:");
            b = scan.nextDouble();
            System.out.println("Informe o valor de c:");
            c = scan.nextDouble();

            delta = Math.pow(b, 2) - (4 * a * c);

            if (delta < 0)
            {
                System.out.println("A equação não possui raízes reais!");
            }
            else if (delta == 0)
            {
                raiz1 = -b / (2 * a);
                System.out.println("A equação possui apenas uma raíz! A raiz é: " + raiz1);
            }
            else
            {
                raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("A equação possui duas raizes reais! Raizes: " + raiz1 + " " + raiz2);
            }
        }
        else
        {
            System.out.println("Essa equação não é de segundo grau!");
        }
    }
}