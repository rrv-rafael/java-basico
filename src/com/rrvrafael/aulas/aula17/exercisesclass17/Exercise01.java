package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota;
        boolean notaValida = false;

        do
        {
            System.out.println("Digite uma nota entre 0 e 10:");
            nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10)
            {
                System.out.println("Nota válida digitada: " + nota);
                notaValida = true;
            }
            else
            {
                System.out.println("Nota inválida! Por favor, digite novamente.");
            }

        }
        while (!notaValida);
    }
}