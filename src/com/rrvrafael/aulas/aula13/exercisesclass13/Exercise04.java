package com.rrvrafael.aulas.aula13.exercisesclass13;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite a nota do 1o Bimestre:");
        nota1 = scan.nextDouble();

        System.out.println("Digite a nota do 2o Bimestre:");
        nota2 = scan.nextDouble();

        System.out.println("Digite a nota do 3o Bimestre:");
        nota3 = scan.nextDouble();

        System.out.println("Digite a nota do 4o Bimestre:");
        nota4 = scan.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média: " + media);
    }
}