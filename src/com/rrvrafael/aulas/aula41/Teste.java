package com.rrvrafael.aulas.aula41;

public class Teste {
    public static void main(String[] args) {
        //Pessoa pessoa = new Pessoa();
        Professor professor = new Professor();
        Aluno aluno = new Aluno();

        //pessoa.setEndereco("Rua 1, nº1");
        professor.setEndereco("Rua 2, nº2");
        aluno.setEndereco("Rua 3, nº3");

        //System.out.println(professor.obterEtiquetaEndereco());
        //System.out.println(aluno.obterEtiquetaEndereco());

        professor.imprimirEtiquetaEndereco();
        aluno.imprimirEtiquetaEndereco();
    }
}
