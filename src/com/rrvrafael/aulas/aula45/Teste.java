package com.rrvrafael.aulas.aula45;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        if (pessoa instanceof Pessoa) {
            System.out.println("é do tipo Pessoa");
        }

        if (aluno instanceof Aluno) {
            System.out.println("é do tipo Aluno");
        }

        if (professor instanceof Professor) {
            System.out.println("é do tipo Professor");
        }

        /*Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno; //upcasting

        Pessoa aluno2 = (Pessoa) new Aluno();

        Pessoa aluno3 = new Pessoa();
        Aluno aluno4 = (Aluno) aluno3;*/
    }
}
