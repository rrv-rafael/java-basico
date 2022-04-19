package com.rrvrafael.aulas.aula20.exercisesclass20;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][][] agendaPessoal = new String[31][8][12];
        String mostrarCompromisso;
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int mes, diaMes, horario, option;
        boolean continuar = true;
        boolean validar;

        System.out.println("Para agendar ou alterar um compromisso, digite de (1 - 31) para indicar o dia, (1 - 12) o mês e (8 - 15) para indicar o horário!");

        do
        {
            System.out.println("\nDigite 1 para agendar um compromisso, 2 para visualizar ou 0 para sair da aplicação:");
            option = scan.nextInt();

            validar = false;

            if (option == 1)
            {
                while (!validar)
                {
                    System.out.println("\nDigite o dia do mês que deseja agendar/alterar:");
                    diaMes = scan.nextInt();

                    System.out.println("Digite o mês que deseja agendar/alterar:");
                    mes = scan.nextInt();

                    System.out.println("Digite o horário que deseja agendar/alterar:");
                    horario = scan.nextInt();

                    if ((diaMes > 0 && diaMes <= 31) && (mes >= 1 && mes <= 12) && (horario >= 8 && horario <= 15))
                    {
                        System.out.println("\nAgora, informe o compromisso:");
                        agendaPessoal[diaMes - 1][horario - 8][mes - 1] = scan.next();
                        validar = true;
                    }
                    else
                    {
                        System.out.println("\nValores inválidos! Digite de acordo com os intervalos informados no início.");
                    }
                }
            }
            else if (option == 2)
            {
                System.out.println("\nPara listar todos os compromissos digite S - SIM e para listar um compromisso específico digite N - NÃO:");
                mostrarCompromisso = scan.next();
                System.out.println();

                if (mostrarCompromisso.equalsIgnoreCase("s"))
                {
                    for (int i = 0; i < agendaPessoal.length; i++)
                    {
                        for (int j = 0; j < agendaPessoal[i].length; j++)
                        {
                            for (int k = 0; k < agendaPessoal[i][j].length; k++)
                            {
                                if (agendaPessoal[i][j][k] != null)
                                {
                                    System.out.println("Compromisso no dia " + (i + 1) + " de " + meses[k] + " às " + (j + 8) + " horas:");
                                    System.out.println(agendaPessoal[i][j][k]);
                                    System.out.println();
                                }
                            }
                        }
                    }
                }
                else
                {
                    while (!validar)
                    {
                        System.out.println("Digite o dia do mês do compromisso desejado:");
                        diaMes = scan.nextInt();

                        System.out.println("Digite mês do compromisso desejado:");
                        mes = scan.nextInt();

                        System.out.println("Digite o horário do compromisso:");
                        horario = scan.nextInt();

                        if ((diaMes > 0 && diaMes <= 31) && (mes >= 1 && mes <= 12) && (horario >= 8 && horario <= 15))
                        {
                            if (agendaPessoal[diaMes - 1][horario - 8][mes - 1] == null)
                            {
                                System.out.println("\nNão existe compromisso nesta data informada.");
                            }
                            else
                            {
                                System.out.println("\nCompromisso no dia " + diaMes + " de " + meses[mes - 1] + " às " + horario + " horas:");
                                System.out.println(agendaPessoal[diaMes - 1][horario - 8][mes - 1]);
                            }

                            validar = true;
                        }
                        else
                        {
                            System.out.println("\nValores inválidos! Digite de acordo com os intervalos informados no início.");
                        }
                    }
                }
            }
            else if (option == 0)
            {
                System.out.println("\nVocê saiu da aplicação...");
                continuar = false;
            }
            else
            {
                System.out.println("Opção inválida! Digite novamente.");
            }
        }
        while (continuar);
    }
}