package com.rrvrafael.aulas.aula36.exercicios.ex02;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;
    private double media;

    public Aluno() {
        notas = new double[4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String dadosAluno() {
        StringBuilder dados;

        dados = new StringBuilder("\nNome: " + this.nome + "\nMatrícula: " + this.matricula + "\nNotas:\n");

        for (double nota : notas) {
            dados.append(nota).append(" ");
        }
        dados.append("\nMédia: ").append(obterMedia()).append("\nSituação: ");

        if (obterMedia() >= 7) {
            dados.append("Aprovado");
        } else {
            dados.append("Reprovado");
        }

        return dados.toString();
    }

    public double obterMedia() {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }
}
