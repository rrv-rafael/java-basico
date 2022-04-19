package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int codigoItem, qtdDesejada;
        String output = "";
        double valorItem = 0, valorTotal = 0;
        boolean sair = false;

        System.out.println("Para encerrar o pedido, digite 0 no código do item.\n");

        do
        {
            System.out.println("Digite o código do item que deseja:");
            codigoItem = scan.nextInt();

            if (codigoItem == 0)
            {
                sair = true;
            }
            else if (codigoItem >= 100 && codigoItem <= 105)
            {
                System.out.println("Digite a quantidade desejada deste item:");
                qtdDesejada = scan.nextInt();

                switch (codigoItem)
                {
                    case 100:
                        valorItem = qtdDesejada * 1.20;
                        output += "Valor a ser pago pelo(s) " + qtdDesejada + " Cachorro Quente: " + valorItem + '\n';
                        break;
                    case 101:
                        valorItem = qtdDesejada * 1.30;
                        output += "Valor a ser pago pelo(s) " + qtdDesejada + " Bauru Simples: " + valorItem + '\n';
                        break;
                    case 102:
                        valorItem = qtdDesejada * 1.50;
                        output += "Valor a ser pago pelo(s) " + qtdDesejada + " Bauru com ovo: " + valorItem + '\n';
                        break;
                    case 103:
                        valorItem = qtdDesejada * 1.20;
                        output += "Valor a ser pago pelo(s) " + qtdDesejada + " Hambúrguer(s): " + valorItem + '\n';
                        break;
                    case 104:
                        valorItem = qtdDesejada * 1.30;
                        output += "Valor a ser pago pelo(s) " + qtdDesejada + " Cheeseburguer(s): " + valorItem + '\n';
                        break;
                    case 105:
                        valorItem = qtdDesejada * 1.00;
                        output += "Valor a ser pago pelo(s) " + qtdDesejada + " Refrigerante(s): " + valorItem + '\n';
                        break;
                }

                valorTotal += valorItem;
            }
            else
            {
                System.out.println("Código inválido, por favor digite novamente.\n");
            }
        }
        while (!sair);

        output += "\nO valor total do seu pedido é: " + valorTotal;

        System.out.println(output);
    }
}