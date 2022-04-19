package com.rrvrafael.aulas.aula15.exercisesclass15;

import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lado1, lado2, lado3;

        System.out.println("Digite o Lado 1:");
        lado1 = scan.nextInt();
        System.out.println("Digite o Lado 2:");
        lado2 = scan.nextInt();
        System.out.println("Digite o Lado 3:");
        lado3 = scan.nextInt();

        if (lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1)
        {
            if (lado1 == lado2 && lado2 == lado3)
            {
                System.out.println("Triângulo Equilátero!");
            }
            else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
            {
                System.out.println("Triângulo Escaleno!");
            }
            else
            {
                System.out.println("Triângulo Isósceles!");
            }
        }
        else
        {
            System.out.println("Os lados informados não formam um trinângulo!");
        }
    }
}