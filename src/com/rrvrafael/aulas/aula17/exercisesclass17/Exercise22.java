package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdCD, count = 0;
        double valorPago, media, soma = 0;

        System.out.println("Digite a quantidade de CDs comprados:");
        qtdCD = scan.nextInt();

        while (count < qtdCD)
        {
            count++;

            System.out.println("Digite a preço pago no " + count + "o CD:");
            valorPago = scan.nextDouble();

            soma += valorPago;
        }

        media = soma / qtdCD;

        System.out.println("O valor total investido em CDs foi: " + soma);
        System.out.println("O valor médio gasto foi de: " + media);
    }
}