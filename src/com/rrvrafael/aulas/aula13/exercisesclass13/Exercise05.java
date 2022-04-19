package com.rrvrafael.aulas.aula13.exercisesclass13;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int metro, cm;

        System.out.println("Digite a metragem:");
        metro = scan.nextInt();

        cm = metro * 100;

        if (metro > 1)
        {
            System.out.println(metro + " metros equivalem à " + cm + " centímetros");
        }
        else
        {
            System.out.println(metro + " metro equivale à " + cm + " centímetros");
        }
    }
}