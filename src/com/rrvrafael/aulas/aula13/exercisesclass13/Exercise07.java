package com.rrvrafael.aulas.aula13.exercisesclass13;

import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double area, lado;

        System.out.println("Digite o lado do quadrado:");
        lado = scan.nextDouble();

        area = Math.pow(lado, 2);

        System.out.println("Área do quadrado: " + area);
    }
}