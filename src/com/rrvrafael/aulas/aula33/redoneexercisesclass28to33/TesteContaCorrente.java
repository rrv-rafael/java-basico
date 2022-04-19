package com.rrvrafael.aulas.aula33.redoneexercisesclass28to33;

import java.util.Scanner;

public class TesteContaCorrente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ContaCorrente conta = new ContaCorrente();

        conta.setSaldo(1000);
        conta.setLimiteEspecial(700);
        conta.setContaEspecial(true);

        int opcao;
        boolean sair = false;
        double valorSaque, deposito;

        do
        {
            System.out.println("* * * Sistema Bancário * * *");
            System.out.println("Escolha a opção desejada:");
            System.out.println("1 - Saque\n2 - Depósito\n3 - Consultar saldo\n4 - Verificar se usa cheque especial ou não\n0 - Finalizar seção");
            System.out.println("\nDigite a opção desejada:");
            opcao = scan.nextInt();

            if (opcao == 1)
            {
                System.out.println("\nDigite a quantia que deseja sacar:");
                valorSaque = scan.nextDouble();

                if (conta.realizarSaque(valorSaque))
                {
                    if (conta.getSaldo() < 0)
                    {
                        System.out.println("\nSaldo após saque utilizando limite especial: " + conta.getSaldo() + "\nLimite especial: " + conta.getLimiteEspecial() + "\n");
                    }
                    else
                    {
                        System.out.println("\nSaldo após saque: " + conta.getSaldo() + "\nLimite especial: " + conta.getLimiteEspecial() + "\n");
                    }

                }
                else
                {
                    System.out.println("\nSaldo indisponível para efetuar o saque!" + "\n");
                }
            }
            else if (opcao == 2)
            {
                System.out.println("\nDigite o valor do depósito que deseja realizar:");
                deposito = scan.nextDouble();

                conta.realizarDeposito(deposito);

                System.out.println("\nSaldo após depósito: " + conta.getSaldo() + "\nLimite especial: " + conta.getLimiteEspecial() + "\n");
            }
            else if (opcao == 3)
            {
                System.out.println("\nSeu saldo atual é: " + conta.consultarSaldo() + "\nLimite especial: " + conta.getLimiteEspecial() + "\n");
            }
            else if (opcao == 4)
            {
                if (conta.consultarStatusLimite())
                {
                    System.out.println("\nVocê está usando cheque especial!" + "\n");
                }
                else
                {
                    System.out.println("\nVocê não está usando cheque especial!" + "\n");
                }
            }
            else if (opcao == 0)
            {
                sair = true;
                System.out.println("\nVocê saiu da aplicação...");
            }
            else
            {
                System.out.println("\nOpção inválida!" + "\n");
            }
        }
        while (!sair);
    }
}
