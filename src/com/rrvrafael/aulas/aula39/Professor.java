package com.rrvrafael.aulas.aula39;

public class Professor extends Pessoa {
    private String departamento;
    private String nomeCurso;
    private double salario;

    public Professor(String departamento, String nomeCurso, double salario) {
        this.departamento = departamento;
        this.nomeCurso = nomeCurso;
        this.salario = salario;
    }

    public Professor(String nome, String cpf, String endereco, String telefoneCelular, String telefoneFixo, String departamento, String nomeCurso, double salario) {
        super(nome, cpf, endereco, telefoneCelular, telefoneFixo);
        this.departamento = departamento;
        this.nomeCurso = nomeCurso;
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
