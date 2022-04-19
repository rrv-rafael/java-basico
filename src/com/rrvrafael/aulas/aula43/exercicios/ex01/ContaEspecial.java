package com.rrvrafael.aulas.aula43.exercicios.ex01;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial() {
        super();
    }

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(String nomeCliente, String numeroConta, double saldo, double limite) {
        super(nomeCliente, numeroConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valorSaque) {
        double saldoTotal = this.limite + this.getSaldo();

        if (saldoTotal >= valorSaque) {
            this.setSaldo(this.getSaldo() - valorSaque);

            return true;
        }

        return false;
    }

    public void depositar(double valorDeposito) {
        this.setSaldo(valorDeposito);
    }

    @Override
    public String toString() {
        return super.toString() + "\nLimite: " + limite;
    }
}
