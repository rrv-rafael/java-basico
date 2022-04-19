package com.rrvrafael.aulas.aula13.exercisesclass13;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tempCelsius, tempFarenheit;

        System.out.println("Digite a temperatura em graus Celsius:");
        tempCelsius = scan.nextDouble();

        tempFarenheit = tempCelsius * ((double) 9 / 5) + 32;

        System.out.println("Temperatura em graus Farenheit: " + tempFarenheit);
    }
}