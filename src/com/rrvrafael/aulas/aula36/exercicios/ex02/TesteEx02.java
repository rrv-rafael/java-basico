package com.rrvrafael.aulas.aula36.exercicios.ex02;

import java.util.Scanner;

public class TesteEx02 {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Aluno[] alunos = new Aluno[5];
        Aluno aluno;
        Professor professor = new Professor();

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do Curso:");
        curso.setNome(scan.nextLine());
        System.out.println("Informe o horário do Curso:");
        curso.setHorario(scan.nextLine());

        System.out.println("Informe o nome do Professor:");
        professor.setNome(scan.nextLine());
        System.out.println("Informe o departamento do Professor:");
        professor.setDepartamento(scan.nextLine());
        System.out.println("Informe o e-mail do Professor:");
        professor.setEmail(scan.nextLine());

        curso.setProfessor(professor);

        System.out.println("\nPreencha os dados dos alunos do curso de " + curso.getNome() + ":");

        double[] notas;

        for (int i = 0; i < alunos.length; i++) {
            aluno = new Aluno();
            System.out.println("\nInforme o nome do aluno:");
            aluno.setNome(scan.nextLine());
            System.out.println("Informe a matricula do aluno:");
            aluno.setMatricula(scan.nextLine());
            System.out.println("Insira as notas do aluno " + aluno.getNome() + ":");

            notas = new double[4];

            for (int j = 0; j < notas.length; j++) {
                System.out.println("Nota " + (j + 1) + ":");
                //Da maneira abaixo, não sei se é considerado uma boa prática de programação, portanto farei de outra maneira
                //aluno.getNotas()[j] = scan.nextDouble();
                notas[j] = scan.nextDouble();
            }
            aluno.setNotas(notas);
            alunos[i] = aluno;
            scan.nextLine();
        }

        curso.setAlunos(alunos);
        curso.mediaAlunos();

        System.out.println(curso.dadosCurso());
        System.out.println(curso.dadosProfessor());
        System.out.println(curso.dadosAlunos());

        System.out.println("Media da turma: " + curso.mediaTurma());
    }
}
