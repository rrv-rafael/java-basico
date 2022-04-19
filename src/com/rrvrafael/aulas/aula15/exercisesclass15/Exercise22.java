package com.rrvrafael.aulas.aula15.exercisesclass15;

import java.util.Scanner;

public class Exercise22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdMorango, qtdMaca;
        double valorPagar, precoMaca, precoMorango, valorTotalDesc;

        System.out.println("Informe a quantidade (em Kg) de morangos:");
        qtdMorango = scan.nextInt();
        System.out.println("Informe a quantidade (em Kg) de maçãs:");
        qtdMaca = scan.nextInt();

        if (qtdMorango <= 5 && qtdMaca <= 5)
        {
            precoMorango = 2.5;
            precoMaca = 1.8;
        }
        else if (qtdMorango > 5 && qtdMaca > 5)
        {
            precoMorango = 2.2;
            precoMaca = 1.5;
        }
        else if (qtdMorango > 5 && qtdMaca <=5)
        {
            precoMorango = 2.2;
            precoMaca = 1.8;
        }
        else
        {
            precoMorango = 2.5;
            precoMaca = 1.5;
        }

        valorPagar = (qtdMorango * precoMorango) + (qtdMaca * precoMaca);

        if (qtdMorango + qtdMaca > 8 || valorPagar > 25)
        {
            valorPagar = valorPagar - (valorPagar * 0.1);
            System.out.println("Entrou aqui");
            //System.out.println("Preço pago pelo Morango: " + precoMorango);
            //System.out.println("Preço pago pela Maçã: " + precoMaca);
            //System.out.println("Valor total a pagar com desconto de 10%: " + valorPagar);
        }
        /*else
        {
            System.out.println("Preço pago pelo Morango: " + precoMorango);
            System.out.println("Preço pago pela Maçã: " + precoMaca);
            System.out.println("Valor total a pagar: " + valorPagar);
        }*/
        System.out.println("Valor total a pagar: " + valorPagar);
    }
}