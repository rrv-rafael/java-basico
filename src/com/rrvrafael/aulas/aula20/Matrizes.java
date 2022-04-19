package com.rrvrafael.aulas.aula20;

public class Matrizes {

    public static void main(String[] args) {

        //Forma de inicializar matrizes e vetores de uma só vez:

        double[][] notasAlunosDois = {{10, 7, 8, 9.5}, {9, 8, 7, 9}};
        double[] mediaAlunosDois = {8.625, 8.25};

        for (int i = 0; i < notasAlunosDois.length; i++)
        {
            System.out.println("Matriz notasAlunosDois: " + (i + 1));
            for (int j = 0; j < notasAlunosDois[i].length; j++)
            {
                System.out.print(notasAlunosDois[i][j] + " ");
            }
            System.out.println("\n");
        }

        for(int i = 0; i < mediaAlunosDois.length; i++)
        {
            System.out.println("Media do aluno " + (i + 1) + ": " + mediaAlunosDois[i] + "\n");
        }

        double[][] notasAlunos = new double[3][4];
        double soma;

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;

        for (int i = 0; i < notasAlunos.length; i++)
        {
            System.out.println("Aluno " + (i + 1) + ":");

            for (int j = 0; j < notasAlunos[i].length; j++)
            {
                System.out.print(notasAlunos[i][j] + " ");
            }
            System.out.println("\n");
        }

        notasAlunos[1][3] = 8;

        for (int i = 0; i < notasAlunos.length; i++)
        {
            soma = 0;

            for (int j = 0; j < notasAlunos[i].length; j++)
            {
                soma += notasAlunos[i][j];
            }

            System.out.println("Média do aluno " + (i + 1) + ": " + (soma / notasAlunos[i].length));
        }
    }
}