package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numero, soma = 0, media;
        int count = 0;

        do
        {
            count++;

            System.out.println("Digite o " + count + "o número:");
            numero = scan.nextInt();

            soma += numero;
        }
        while (count < 5);

        media = (soma / count);

        System.out.println("Soma dos números digitados: " + soma);
        System.out.println("Média dos números digitados: " + media);
    }
}