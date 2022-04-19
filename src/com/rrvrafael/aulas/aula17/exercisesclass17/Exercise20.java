package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdPessoas, idade, count = 0;
        double media, soma = 0;

        System.out.println("Digite a quantidade de pessoas que vão informar sua idade:");
        qtdPessoas = scan.nextInt();

        while (count < qtdPessoas)
        {
            count++;

            System.out.println("Digite a " + count + "a idade:");
            idade = scan.nextInt();

            soma += idade;
        }

        media = soma / count;

        System.out.println(media);

        if (media >= 0 && media <= 25)
        {
            System.out.println("A turma é jovem!");
        }
        else if (media >= 26 && media <= 60)
        {
            System.out.println("A turma é adulta!");
        }
        else
        {
            System.out.println("A turma é idosa!");
        }
    }
}