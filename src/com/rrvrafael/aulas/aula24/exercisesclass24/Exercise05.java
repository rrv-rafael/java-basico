package com.rrvrafael.aulas.aula24.exercisesclass24;

public class Exercise05 {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.numeroConta = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numeroConta + ": " + conta.saldo);
    }
}