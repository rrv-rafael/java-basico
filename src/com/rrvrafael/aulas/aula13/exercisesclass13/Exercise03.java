package com.rrvrafael.aulas.aula13.exercisesclass13;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2, soma;

        System.out.println("Digite o 1o número:");
        n1 = scan.nextInt();
        System.out.println("Digite o 2o número:");
        n2 = scan.nextInt();

        soma = n1 + n2;

        System.out.println("Resultado da soma: " + soma);
    }
}