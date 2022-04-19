package com.rrvrafael.aulas.aula20.exercisesclass20;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] agendaPessoal = new String[31][24];
        String mostrarCompromisso;
        int diaMes, horario, option, count = 0;
        boolean continuar = true;
        boolean validar;

        System.out.println("Para agendar ou alterar um compromisso, digite de (1 - 31) para indicar o dia do mês e de (1 - 24) para indicar o horário!");

        do
        {
            System.out.println("\nDigite 1 para agendar um compromisso, 2 para visualizar ou 0 para sair da aplicação:");
            option = scan.nextInt();

            validar = false;

            if (option == 1)
            {
                while (!validar)
                {
                    System.out.println("\nInforme o dia do mês que deseja agendar/alterar:");
                    diaMes = scan.nextInt();

                    System.out.println("Informe o horário que deseja agendar/alterar:");
                    horario = scan.nextInt();

                    if ((diaMes > 0 && diaMes <= 31) && (horario > 0 && horario <= 24))
                    {
                        System.out.println("\nAgora, informe o compromisso:");
                        agendaPessoal[diaMes - 1][horario - 1] = scan.next();
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
                            if (agendaPessoal[i][j] != null)
                            {
                                count++;
                                System.out.println("Compromisso no dia " + (i + 1) + " às " + (j + 1) + ":");
                                System.out.println(agendaPessoal[i][j]);
                                System.out.println();
                            }
                        }
                    }

                    if (count == 0)
                    {
                        System.out.println("Nenhum compromisso agendado!");
                    }
                }
                else
                {
                    System.out.println("Digite o dia do mês do compromisso desejado:");
                    diaMes = scan.nextInt();

                    System.out.println("Digite o horário do compromisso:");
                    horario = scan.nextInt();

                    if (agendaPessoal[diaMes - 1][horario - 1] == null)
                    {
                        System.out.println("\nNenhum compromisso agendado para o dia e horário informados.");
                    }
                    else
                    {
                        System.out.println("\nCompromisso no dia " + diaMes + " às " + horario + ":");
                        System.out.println(agendaPessoal[diaMes - 1][horario - 1]);
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