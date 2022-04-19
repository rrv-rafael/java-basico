package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdTermos, n = 1, m = 1;
        double soma = 0;

        System.out.println("Digite a quantidade de termos desejada:");
        qtdTermos = scan.nextInt();

        for (int i = 1; i < qtdTermos; i++)
        {
            System.out.print(n + "/" + m + " + ");

            soma += ((double) n / m);

            n++;
            m += 2;
        }

        System.out.println(n + "/" + m);

        System.out.println("\nSoma da série: " + soma);
    }
}