package com.rrvrafael.aulas.aula33.redoneexercisesclass28to33;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        int option;
        boolean sair = false;

        System.out.println("* * * Sistema Acadêmico * * *");
        System.out.println("Digite o nome do aluno:");
        aluno.setNome(scan.next());
        System.out.println("Informe a matrícula do aluno:");
        aluno.setMatricula(scan.next());
        System.out.println("Digite o nome do curso:");
        aluno.setCursoMatriculado(scan.next());

        for (int i = 0; i < aluno.getDisciplinas().length; i++) {
            System.out.println("Digite o nome da disciplinaaaa:");
            aluno.setDisciplinaPosicao(i, scan.next());
            System.out.println("Digite a nota da disciplina:");
            aluno.setNotaPosicao(i, scan.nextDouble());
        }

        //Abaixo uma maneira que funcionou, mas que não sei se é uma maneira correta de se fazer
        /*for (int i = 0; i < aluno.getDisciplinas().length; i++)
        {
            System.out.println("Digite o nome da disciplina:");
            aluno.getDisciplinas()[i] = scan.next();
            System.out.println("Digite a nota da disciplina:");
            aluno.getNotas()[i] = scan.nextDouble();
        }*/

        do
        {
            System.out.println("Com este sistema você poderá realizar as seguintes ações:");
            System.out.println("1 - Visualizar disciplinas cursadas\n2 - Visualizar notas\n3 - Visualizar disciplinas aprovadas\n0 - Finalizar seção");
            System.out.println("\nDigite a opção desejada:");
            option = scan.nextInt();

            if (option == 1)
            {
                aluno.mostrarDisciplinas();
            }
            else if (option == 2)
            {
                aluno.mostrarNotas();
            }
            else if (option == 3)
            {
                aluno.verificarNota();
            }
            else if (option == 0)
            {
                sair = true;
                System.out.println("Encerrando a aplicação...");
            }
            else
            {
                System.out.println("Digite uma opção válida!");
            }
        }
        while (!sair);
    }
}
