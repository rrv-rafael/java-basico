package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, resultado;

        System.out.println("Informe o número de qual tabuada vc deseja gerar:");
        numero = scan.nextInt();

        System.out.println("Tabuada de " + numero + ":");

        for (int i = 1; i <= 10; i++)
        {
            resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }
}