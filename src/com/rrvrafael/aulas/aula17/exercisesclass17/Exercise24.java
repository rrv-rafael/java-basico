package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double precoUnitario, precoTabela = 0;

        System.out.println("Informe o preço do pão: ");
        precoUnitario = scan.nextDouble();

        System.out.println("Preço do pão: R$ " + precoUnitario);
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        for (int i = 1; i <= 50; i++)
        {
            System.out.println(i + " - R$ " + (precoTabela += precoUnitario));
        }
    }
}