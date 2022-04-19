package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdTurmas, qtdAlunos, count = 1;
        double media, soma = 0;
        boolean invalido;

        System.out.println("Digite a quantidade de turmas:");
        qtdTurmas = scan.nextInt();

        while (count <= qtdTurmas)
        {
            invalido = true;

            do
            {
                System.out.println("Informe a quantidade de alunos da turma " + count + ":");
                qtdAlunos = scan.nextInt();

                if (qtdAlunos <= 40)
                {
                    invalido = false;
                    count++;
                }
                else
                {
                    System.out.println("A turma não pode conter mais de 40 alunos! Digite novamente.");
                }
            }
            while (invalido);

            soma += qtdAlunos;
        }

        media = soma / qtdTurmas;

        System.out.println("O número médio de alunos por turma é: " + media);
    }
}