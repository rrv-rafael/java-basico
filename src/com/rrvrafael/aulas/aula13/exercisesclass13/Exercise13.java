package com.rrvrafael.aulas.aula13.exercisesclass13;

import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double ganhoPorHora, numHorasTrabMes, salarioBruto, salarioLiquido;

        System.out.println("Informe o quanto você ganha por hora:");
        ganhoPorHora = scan.nextDouble();

        System.out.println("Informe o número de horas trabalhadas no mês:");
        numHorasTrabMes = scan.nextDouble();

        salarioBruto = ganhoPorHora * numHorasTrabMes;

        System.out.println("+ Salário Bruto: R$" + salarioBruto + '\n' + "- IR (11%): R$" + (salarioBruto * 0.11));
        System.out.println("- INSS (8%): R$" + (salarioBruto * 0.08) + '\n' + "- Sindicato (5%): R$" + (salarioBruto * 0.05));
        salarioLiquido = salarioBruto - (salarioBruto * 0.24);
        System.out.println("= Salário Liquido: R$" + salarioLiquido);
    }
}