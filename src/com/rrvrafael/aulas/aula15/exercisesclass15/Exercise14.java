package com.rrvrafael.aulas.aula15.exercisesclass15;

import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1, nota2, media;
        String conceito, mensagem;

        System.out.println("Informe a 1a nota:");
        nota1 = scan.nextDouble();
        System.out.println("Informe a 2a nota:");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 9)
        {
            conceito = "A";
            mensagem = "APROVADO";
        }
        else if (media >= 7.5 && media < 9)
        {
            conceito = "B";
            mensagem = "APROVADO";
        }
        else if (media >= 6 && media < 7.5)
        {
            conceito = "C";
            mensagem = "APROVADO";
        }
        else if (media >= 4 && media < 6)
        {
            conceito = "D";
            mensagem = "REPROVADO";
        }
        else
        {
            conceito = "E";
            mensagem = "REPROVADO";
        }

        System.out.println("Nota 1: " + nota1 + '\n' + "Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println(mensagem);
    }
}