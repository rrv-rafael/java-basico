package com.rrvrafael.aulas.aula27.exercisesclass25to27;

public class Aluno {

    String nome;
    String matricula;
    String cursoMatriculado;
    String[] disciplinas;
    double[] notas;

    void mostrarDisciplinas()
    {
        System.out.println("Disciplinas cursadas:");
        for (String disciplina : disciplinas)
        {
            System.out.println(disciplina);
        }

        System.out.println();
    }

    void mostrarNotas()
    {
        System.out.println("Notas:");
        for (int i = 0; i < notas.length; i++)
        {
            System.out.println(disciplinas[i] + " - " + notas[i]);
        }

        System.out.println();
    }

    void verificarNota()
    {
        System.out.println("Disciplinas aprovadas:");

        for (int i = 0; i < notas.length; i++)
        {
            if (notas[i] >= 7 )
            {
                System.out.println("Aprovado(a) na disciplina " + disciplinas[i] + " com nota " + notas[i]);
            }
        }

        System.out.println();
    }
}