package com.rrvrafael.aulas.aula13.exercisesclass13;

import java.util.Scanner;

public class Exercise09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tempFarenheit, tempCelsius;

        System.out.println("Digite a temperatura em graus Farenheit:");
        tempFarenheit = scan.nextDouble();

        tempCelsius = (5 * (tempFarenheit - 32) / 9);

        System.out.println("Temperatura em graus Celsius: " + tempCelsius);
    }
}