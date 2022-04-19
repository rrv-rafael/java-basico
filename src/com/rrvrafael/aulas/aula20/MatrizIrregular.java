package com.rrvrafael.aulas.aula20;

import java.util.Scanner;

public class MatrizIrregular {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] nomesFilhos;
        int qtdFilhos, qtdEntrevistados;

        System.out.println("Informe a quantidade de pessoas que serão entrevistadas:");
        qtdEntrevistados = scan.nextInt();

        nomesFilhos = new String[qtdEntrevistados][];

        for (int i = 0; i < nomesFilhos.length; i++)
        {
            System.out.println("Digite a quantidade de filhos que vc tem:");
            qtdFilhos = scan.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < nomesFilhos[i].length; j++)
            {
                System.out.println("Digite o nome do filho " + (j + 1) + ":");
                nomesFilhos[i][j] = scan.next();
            }
        }

        System.out.println("\nQuantidade de pessoas entrevistadas: " + nomesFilhos.length + "\n");

        for (int i = 0; i < nomesFilhos.length; i++)
        {
            System.out.println("Pessoa " + (i + 1) + " tem " + nomesFilhos[i].length + " filhos e seus nomes são:");
            for (int j = 0; j < nomesFilhos[i].length; j++)
            {
                System.out.println(nomesFilhos[i][j]);
            }
            System.out.println();
        }
    }
}