package com.rrvrafael.aulas.aula37;

public class Aluno extends Pessoa {
    private String curso;
    private String[] notas;

    public Aluno() {
    }

    public Aluno(String curso, String[] notas) {
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getNotas() {
        return notas;
    }

    public void setNotas(String[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() { return 0; }

    public boolean verificarAprovado() { return true; }
}
