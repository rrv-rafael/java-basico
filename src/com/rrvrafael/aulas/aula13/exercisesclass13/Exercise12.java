package com.rrvrafael.aulas.aula13.exercisesclass13;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double altura, pesoIdeal;

        System.out.println("Digite a sua altura:");
        altura = scan.nextDouble();

        pesoIdeal = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}