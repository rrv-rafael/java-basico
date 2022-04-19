package com.rrvrafael.aulas.aula41;

public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;

    public Aluno() {
    }

    public Aluno(String curso, double[] notas) {
        this.curso = curso;
        this.notas = notas;
    }

    public Aluno(String nome, String cpf, String endereco, String telefoneCelular, String telefoneFixo, String curso, double[] notas) {
        super(nome, cpf, endereco, telefoneCelular, telefoneFixo);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterEtiquetaEndereco() {
        String endereco;

        endereco = "Endereço do aluno: " + this.getEndereco();

        System.out.println("Endereço dentro do método: " + this.getEndereco());

        return endereco;
    }

    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }
}
