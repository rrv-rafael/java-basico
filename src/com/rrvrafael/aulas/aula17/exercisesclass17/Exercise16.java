package com.rrvrafael.aulas.aula17.exercisesclass17;

public class Exercise16 {

    public static void main(String[] args) {

        int soma = 1, numAnterior = 1, flag = 0;

        System.out.println("Série de Fibonacci:");

        while (soma < 500)
        {
            soma += flag;
            flag = numAnterior;
            numAnterior = soma;
            System.out.println(soma);
        }
    }
}