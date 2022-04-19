package com.rrvrafael.aulas.aula43.exercicios.ex01;

public class ContaBancaria {
    private String nomeCliente;
    private String numeroConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, String numeroConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valorSaque) {
        if (this.saldo >= valorSaque) {
            this.saldo -= valorSaque;

            return true;
        }

        return false;
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    @Override
    public String toString() {
        return "\nCliente: " + nomeCliente + "\n" + "Número da Conta: " + numeroConta + "\n" + "Saldo: " + saldo;
    }
}
