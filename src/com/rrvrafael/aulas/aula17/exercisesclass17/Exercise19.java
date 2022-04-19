package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota, media, soma = 0;
        int qtdNotas, count = 0;

        System.out.println("Digite a quantidade de notas que deseja gerar a média:");
        qtdNotas = scan.nextInt();

        while (count < qtdNotas)
        {
            count++;
            System.out.println("Digite a nota " + count + ":");
            nota = scan.nextDouble();

            soma += nota;
        }

        media = soma / count;

        System.out.println("Média das notas digitadas: " + media);
    }
}