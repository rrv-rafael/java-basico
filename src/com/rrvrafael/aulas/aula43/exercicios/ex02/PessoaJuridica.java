package com.rrvrafael.aulas.aula43.exercicios.ex02;

public class PessoaJuridica extends Contribuinte {
    private String cnjp;

    public PessoaJuridica() {

    }

    public PessoaJuridica(String cnjp) {
        this.cnjp = cnjp;
    }

    public PessoaJuridica(String nome, double rendaBruta, String cnjp) {
        super(nome, rendaBruta);
        this.cnjp = cnjp;
    }

    public String getCnjp() {
        return cnjp;
    }

    public void setCnjp(String cnjp) {
        this.cnjp = cnjp;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPessoa Jurídica - CNPJ: " + cnjp + "\nImposto a ser pago: " + calcularImposto();
    }
}
