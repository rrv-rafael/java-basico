package com.rrvrafael.aulas.aula15.exercisesclass15;

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salario, reajuste, novoSalario;

        System.out.println("Informe o salário atual:");
        salario = scan.nextDouble();

        if (salario <= 280)
        {
            reajuste = 0.2;
        }
        else if (salario > 280 && salario <= 700)
        {
            reajuste = 0.15;
        }
        else if (salario > 700 && salario <= 1500)
        {
            reajuste = 0.1;
        }
        else
        {
            reajuste = 0.05;
        }

        novoSalario = salario + (salario * reajuste);

        System.out.println("Salário antes do reajuste: R$" + salario);
        System.out.println("Percentual de aumento aplicado: " + ((int)(reajuste * 100)) + "%");
        System.out.println("Valor do aumento: R$" + (salario * reajuste));
        System.out.println("Novo salário após o aumento: R$" + novoSalario);
    }
}