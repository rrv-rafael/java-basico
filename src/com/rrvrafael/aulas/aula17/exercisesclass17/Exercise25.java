package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorProduto, total = 0, pagamento, troco;
        int qtdProduto = 0;
        String output = "\nLojas Tabajara", compra;

        System.out.println("Lojas Tabajara");

        do
        {
            qtdProduto++;

            System.out.println("Digite o preço do produto " + qtdProduto + ": ");
            valorProduto = scan.nextDouble();

            total += valorProduto;

            output += "\nProduto " + qtdProduto + ": R$ " + valorProduto;

            if (valorProduto == 0)
            {
                System.out.println("\nInforme o valor em dinheiro fornecido pelo cliente:");
                pagamento = scan.nextDouble();

                System.out.println(output);

                System.out.println("Total: R$ " + total);
                System.out.println("Dinheiro: R$ " + pagamento);

                troco = pagamento - total;

                System.out.println("Troco: R$ " + troco);

                System.out.println("\nDeseja inserir uma nova compra? S p/ Sim e N p/ Não:");
                compra = scan.next();

                if (compra.equalsIgnoreCase("s"))
                {
                    qtdProduto = 0;
                    total = 0;
                    output = "\nLojas Tabajara";
                    valorProduto = 1;
                }
            }
        }
        while (valorProduto != 0);
    }
}