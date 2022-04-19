package com.rrvrafael.aulas.aula43.exercicios.ex01;

public class Teste {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        ContaPoupanca poupanca = new ContaPoupanca();
        ContaEspecial contaEspecial = new ContaEspecial();

        //Dados da conta Bancária:

        System.out.println("\nDetalhes da conta bancária:");

        conta.setNomeCliente("Rafael Rodrigues Vitor");
        conta.setNumeroConta("11111");

        double deposito, saque, rendimento = 0.5;

        deposito = 100;

        conta.depositar(deposito);

        System.out.println("Saldo: " + conta.getSaldo());

        saque = 50;

        realizarSaque(conta, saque);

        saque = 70;

        realizarSaque(conta, saque);

        System.out.println("\nDados da conta bancária: " + conta);

        //Dados da conta Poupança:

        System.out.println("\nDetalhes da conta poupança:");

        poupanca.setNomeCliente("Renan Craldino Vitor");
        poupanca.setNumeroConta("22222");
        poupanca.setDiaRendimento(13);

        poupanca.depositar(deposito);

        System.out.println("Saldo: " + poupanca.getSaldo());

        saque = 50;

        realizarSaque(poupanca, saque);

        saque = 70;

        realizarSaque(poupanca, saque);

        if (poupanca.calcularNovoSaldo(rendimento)) {
            System.out.println("Novo rendimento aplicado. Saldo atualizado: " + poupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento. Novo saldo não calculado.");
        }

        System.out.println("\nDados da conta poupança: " + poupanca);

        //Dados da conta especial:

        contaEspecial.setNomeCliente("José Gilson Vitor Junior");
        contaEspecial.setNumeroConta("33333");
        contaEspecial.setLimite(50);

        System.out.println("\nDetalhes da conta especial:");

        contaEspecial.depositar(deposito);

        System.out.println("Saldo: " + contaEspecial.getSaldo());

        saque = 50;

        realizarSaque(contaEspecial, saque);

        saque = 70;

        realizarSaque(contaEspecial, saque);

        saque = 80;

        realizarSaque(contaEspecial, saque);

        System.out.println("\nDados da conta especial: " + contaEspecial);

        /*double rendimento, saque, deposito;

        rendimento = 0.1;

        conta.setNomeCliente("Rafael Rodrigues Vitor");
        conta.setNumeroConta("520063483");
        conta.setSaldo(5000);

        poupanca.setNomeCliente("Rafael Rodrigues Vitor");
        poupanca.setNumeroConta("254789314");
        poupanca.setSaldo(3000);
        poupanca.setDiaRendimento(12);

        contaEspecial.setNomeCliente("Rafael Rodrigues Vitor");
        contaEspecial.setNumeroConta("2541396");
        contaEspecial.setSaldo(1000);
        contaEspecial.setLimite(1500);

        System.out.println("Saldo da poupança: " + poupanca.getSaldo());

        if (poupanca.calcularNovoSaldo(rendimento)) {
            System.out.println("\nSaldo da poupança após o rendimento: " + poupanca.getSaldo());
        } else {
            System.out.println("\nNão é o dia do rendimento da poupança.");
        }

        saque = 700;

        if (conta.sacar(saque)) {
            System.out.println("\nSaldo da conta bancária após saque: " + conta.getSaldo());
        } else {
            System.out.println("\nSaldo indisponível. Seu saldo é: " + conta.getSaldo());
        }

        saque = 500;

        if (contaEspecial.sacar(saque)) {
            System.out.println("\nSaldo da conta bancária após saque: " + conta.getSaldo());
        } else {
            System.out.println("\nSaldo indisponível. Seu saldo é: " + conta.getSaldo());
        }

        deposito = 450;

        conta.depositar(deposito);

        deposito = 3000;

        poupanca.depositar(deposito);

        deposito = 500;

        contaEspecial.depositar(deposito);

        System.out.println("\nDados da conta bancária: " + conta);
        System.out.println("\nDados da conta especial: " + contaEspecial);
        System.out.println("\nDados da conta poupança: " + poupanca);*/
    }

    private static void realizarSaque(ContaBancaria conta, double saque) {
        if (conta.sacar(saque)) {
            System.out.println("\nSaque efetuado com sucesso. Saldo atualizado: " + conta.getSaldo());
        } else {
            System.out.println("\nSaldo insuficiente para saque de: " + saque + ". Seu saldo é: " + conta.getSaldo());
        }
    }
}
