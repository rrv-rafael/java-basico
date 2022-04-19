package com.rrvrafael.aulas.aula33.exercisesclass28to33;

public class Aluno {
    private String nome;
    private String matricula;
    private String cursoMatriculado;
    private String[] disciplinas;
    private double[] notas;

    public Aluno(String nome, String matricula, String cursoMatriculado, String[] disciplinas, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.cursoMatriculado = cursoMatriculado;
        this.disciplinas = disciplinas;
        this.notas = notas;
    }

    public Aluno() {
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

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void mostrarDisciplinas()
    {
        System.out.println("Disciplinas cursadas:");
        for (String disciplina : this.disciplinas)
        {
            System.out.println(disciplina);
        }

        System.out.println();
    }

    public void mostrarNotas()
    {
        System.out.println("Notas:");
        for (int i = 0; i < this.notas.length; i++)
        {
            System.out.println(this.disciplinas[i] + " - " + this.notas[i]);
        }

        System.out.println();
    }

    public void verificarNota()
    {
        System.out.println("Disciplinas aprovadas:");

        for (int i = 0; i < this.notas.length; i++)
        {
            if (this.notas[i] >= 7 )
            {
                System.out.println("Aprovado(a) na disciplina " + this.disciplinas[i] + " com nota " + this.notas[i]);
            }
        }

        System.out.println();
    }
}
