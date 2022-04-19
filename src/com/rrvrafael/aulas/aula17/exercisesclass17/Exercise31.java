package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise31 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salario = 1000, salarioAtual = 0, aumentoPercentual = 0.015;
        int ano = 1995, anoAtual = 2021;

        DecimalFormat format = new DecimalFormat("###,###.##");

        for (int i = anoAtual - ano; i > 0; i--)
        {
            ano++;
            //System.out.println(ano);
            if (ano == 1996)
            {
                salarioAtual = salario + (salario * aumentoPercentual);
            }
            else if (ano > 1996)
            {
                aumentoPercentual = (aumentoPercentual * 2);
                salarioAtual = salarioAtual + (salarioAtual * aumentoPercentual);
            }

            System.out.println("Salário no ano de " + ano + ": " + format.format(salarioAtual));
        }
        //System.out.println("Salário atual no ano de 2021: " + salarioAtual);
    }
}