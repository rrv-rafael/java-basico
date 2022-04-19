package com.rrvrafael.aulas.aula40;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa professor = new Professor();
        Pessoa aluno = new Aluno();

        pessoa.setEndereco("Rua 1, nº 1");
        professor.setEndereco("Rua 2, nº 2");
        aluno.setEndereco("Rua 3, nº 3");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
    }
}
