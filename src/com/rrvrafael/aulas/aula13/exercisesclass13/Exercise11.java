package com.rrvrafael.aulas.aula13.exercisesclass13;

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numReal, soma, produto;
        int num1, num2;

        System.out.println("Digite o 1o número inteiro:");
        num1 = scan.nextInt();

        System.out.println("Digite o 2o número inteiro:");
        num2 = scan.nextInt();

        System.out.println("Digite um número real: ");
        numReal = scan.nextDouble();

        produto = (num1 * 2) * ((double)num2 / 2);
        soma = (num1 * 3) + numReal;

        System.out.println("Produto do dobro do primeiro com metade do segundo: " + produto);
        System.out.println("Soma do triplo do primeiro com o terceiro: " + soma);
        System.out.println("Terceiro elevado ao cubo " + Math.pow(numReal, 3));
    }
}