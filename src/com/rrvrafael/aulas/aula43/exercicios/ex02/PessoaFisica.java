package com.rrvrafael.aulas.aula43.exercicios.ex02;

public class PessoaFisica extends Contribuinte {
    private String cpf;

    public PessoaFisica() {

    }

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, double rendaBruta, String cpf) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double calcularImposto() {
        double rendaBruta = this.getRendaBruta();

        if (rendaBruta <= 1400) {
            return 0;
        } else if (rendaBruta > 1400 && rendaBruta <= 2100) {
            return (rendaBruta * 0.1) - 100;
        } else if (rendaBruta > 2100 && rendaBruta <= 2800) {
            return (rendaBruta * 0.15) - 270;
        } else if (rendaBruta > 2800 && rendaBruta <= 3600) {
            return (rendaBruta * 0.25) - 500;
        } else {
            return (rendaBruta * 0.3) - 700;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nPessoa Fisica - CPF: " + cpf + "\nImposto a ser pago: " + calcularImposto();
    }
}
