package com.rrvrafael.aulas.aula13.exercisesclass13;

import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double ganhoHora, nHorasTrabMes, salario;

        System.out.println("Digite o quanto você ganha por hora:");
        ganhoHora = scan.nextDouble();

        System.out.println("Digite o número de horas trabalhadas no mês:");
        nHorasTrabMes = scan.nextDouble();

        salario = ganhoHora * nHorasTrabMes;

        System.out.println("Seu salário será: " + salario);
    }
}