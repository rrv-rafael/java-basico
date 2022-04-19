package com.rrvrafael.aulas.aula43;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setCurso("Sistemas de Informação");
        double[] notas = {10, 9, 8, 9.5};
        aluno.setNotas(notas);

        /*System.out.println("Curso: " + aluno.getCurso() + "\nNotas:");

        for (int i = 0; i < aluno.getNotas().length; i++) {
            System.out.println(aluno.getNotas()[i]);
        }*/

        System.out.println(aluno);

        String s1 = "aaaaaaaaaaa";
        String s2 = "aaaaaaaaaaA";

        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();

        aluno2.setCurso("Sistemas de Informação");
        double[] notas2 = {10, 9, 8, 9.5};
        aluno2.setNotas(notas2);

        System.out.println("Comparando classes aluno:");

        System.out.println(aluno.equals(aluno2));
    }
}
