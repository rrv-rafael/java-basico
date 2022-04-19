package com.rrvrafael.aulas.aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {
    private String curso;
    private double[] notas;

    public Aluno() {
    }

    public Aluno(String curso, double[] notas) {
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

        endereco = "Endereço do aluno(a): ";

        return endereco;
    }

    public void imprimirEtiquetaEndereco() {
        System.out.println(obterEtiquetaEndereco());
    }

    @Override
    public String toString() {
        return "Curso: " + curso + "\nNotas: " + Arrays.toString(notas);
    }

    /*public String toString() {
        StringBuilder dados = new StringBuilder();

        dados.append(curso).append("\n");

        for (double nota : notas) {
            dados.append(nota).append(" ");
        }

        return dados.toString();
    }*/
}
