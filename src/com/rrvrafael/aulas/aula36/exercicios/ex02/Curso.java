package com.rrvrafael.aulas.aula36.exercicios.ex02;

public class Curso {
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public Curso() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String dadosCurso() {
        String retornoCurso;

        retornoCurso = "\nDados do Curso:\n" + "Nome: " + this.nome + "\nHorário: " + this.horario;

        return retornoCurso;
    }

    public String dadosProfessor() {
        String retornoProfessor;

        retornoProfessor = professor.retornarDados();

        return retornoProfessor;
    }

    public String dadosAlunos() {
        StringBuilder dados = new StringBuilder();

        for (Aluno aluno : alunos) {
            dados.append(aluno.dadosAluno()).append("\n");
        }

        return dados.toString();
    }

    public void mediaAlunos() {
        for (Aluno aluno : alunos) {
            aluno.setMedia(aluno.obterMedia());
        }
    }

    public double mediaTurma() {
        double soma = 0;

        for (Aluno aluno : alunos) {
            soma += aluno.getMedia();
        }

        return soma / alunos.length;
    }
}
