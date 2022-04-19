package com.rrvrafael.aulas.aula15.exercisesclass15;

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdLitrosVendidos;
        double valorPagar = 0;
        String tipoCombustivel;

        System.out.println("Informe a quantidade de litros vendidos:");
        qtdLitrosVendidos = scan.nextInt();
        System.out.println("Informe o tipo de combustível vendido (A-álcool | G-gasolina):");
        tipoCombustivel = scan.next();

        if (tipoCombustivel.equalsIgnoreCase("A"))
        {
            if (qtdLitrosVendidos <= 20)
            {
                valorPagar = qtdLitrosVendidos * 1.9 - ((qtdLitrosVendidos * 1.9) * 0.03);
            }
            else
            {
                valorPagar = qtdLitrosVendidos * 1.9 - ((qtdLitrosVendidos * 1.9) * 0.05);
            }
        }
        else if (tipoCombustivel.equalsIgnoreCase("G"))
        {
            if (qtdLitrosVendidos <= 20)
            {
                valorPagar = qtdLitrosVendidos * 2.5 - ((qtdLitrosVendidos * 2.5) * 0.04);
            }
            else
            {
                valorPagar = qtdLitrosVendidos * 2.5 - ((qtdLitrosVendidos * 2.5) * 0.06);
            }
        }

        System.out.println("Valor a ser pago pelo cliente: " + valorPagar);
    }
}