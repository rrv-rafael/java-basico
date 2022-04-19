package com.rrvrafael.aulas.aula33.exercisesclass28to33;

public class ContaCorrente {

    private String numeroConta;
    private double saldo;
    private boolean contaEspecial;
    private double limiteEspecial;

    public ContaCorrente(String numeroConta, double saldo, boolean contaEspecial, double limiteEspecial) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.contaEspecial = contaEspecial;
        this.limiteEspecial = limiteEspecial;
    }

    public ContaCorrente() {
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

    public boolean getContaEspecial() {
        return contaEspecial;
    }

    public void setContaEspecial(boolean contaEspecial) {
        this.contaEspecial = contaEspecial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public boolean realizarSaque(double valorSaque) {
        if (valorSaque <= this.saldo) {
            debitarConta(valorSaque);
            return true;
        }
        else if (this.contaEspecial) {
            if (this.saldo > 0) {
                if (valorSaque <= (this.limiteEspecial + this.saldo)) {
                    this.limiteEspecial = this.limiteEspecial - (valorSaque - this.saldo);
                    debitarConta(valorSaque);
                    return true;
                }
            }
            else {
                if (valorSaque <= this.limiteEspecial) {
                    this.limiteEspecial -= valorSaque;
                    debitarConta(valorSaque);
                    return true;
                }
            }
        }

        return false;
    }

    public void debitarConta(double valorSaque) {
        this.saldo -= valorSaque;
    }

    public void realizarDeposito(double deposito) {
        this.saldo += deposito;

        if (deposito + this.limiteEspecial > 700) {
            this.limiteEspecial = 700;
        }
        else {
            this.limiteEspecial += deposito;
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public boolean consultarStatusLimite() {
        return this.limiteEspecial < 700;
    }
}
