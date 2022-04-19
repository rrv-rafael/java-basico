package com.rrvrafael.aulas.aula20.exercisesclass20;

import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] jogoVelha = new String[3][3];
        String jogadorUm = "", jogadorDois = "";
        int posicao = 0, count = 0, countO, countX, countDPO, countDPX, countDSO, countDSX, countLO = 0, countLX = 0, countCO = 0, countCX = 0;
        boolean continuar = true;
        boolean jogada = true;

        System.out.println("Posições disponíveis para escolher:\n");

        for (int i = 0; i < jogoVelha.length; i++)
        {
            for (int j = 0; j < jogoVelha[i].length; j++)
            {
                posicao++;
                jogoVelha[i][j] = Integer.toString(posicao);

                System.out.print(jogoVelha[i][j] + " ");
            }

            System.out.println();
        }

        do
        {
            if (jogada)
            {
                System.out.println("\nJogador 1! Informe a posição que deseja colocar a O.");
                jogadorUm = scan.next();
            }
            else
            {
                System.out.println("\nJogador 2! Informe a posição que deseja colocar o X.");
                jogadorDois = scan.next();
            }

            System.out.println("\nPosições disponíveis para escolher:\n");

            count++;

            countDPO = 0;
            countDPX = 0;
            countDSO = 0;
            countDSX = 0;

            for (int i = 0; i < jogoVelha.length; i++)
            {
                countO = 0;
                countX = 0;

                for (int j = 0; j < jogoVelha[i].length; j++)
                {
                    if (jogada)
                    {
                        if (jogadorUm.equals(jogoVelha[i][j]))
                        {
                            jogoVelha[i][j] = "O";
                            jogada = false;
                        }
                    }
                    else
                    {
                        if (jogadorDois.equals(jogoVelha[i][j]))
                        {
                            jogoVelha[i][j] = "X";
                            jogada = true;
                        }
                    }

                    System.out.print(jogoVelha[i][j] + " ");

                    if (count > 4)
                    {
                        if (jogoVelha[i][j].equals("O"))
                        {
                            countO++;
                            countLO = countO;
                        }
                        else if (jogoVelha[i][j].equals("X"))
                        {
                            countX++;
                            countLX = countX;
                        }

                        if (i == j)
                        {
                            if (jogoVelha[i][j].equals("O"))
                            {
                                countDPO++;
                            }
                            else if (jogoVelha[i][j].equals("X"))
                            {
                                countDPX++;
                            }
                        }

                        if ((i + j) == (jogoVelha.length - 1))
                        {
                            if (jogoVelha[i][j].equals("O"))
                            {
                                countDSO++;
                            }
                            else if (jogoVelha[i][j].equals("X"))
                            {
                                countDSX++;
                            }
                        }
                    }
                }

                System.out.println();
            }

            if (count > 4)
            {
                if (countLO == 3)
                {
                    System.out.println("\nJogador 1 ganhou!");
                    break;
                }
                else if (countLX == 3)
                {
                    System.out.println("\nJogador 2 ganhou!");
                    break;
                }
                else if (countDPO == 3)
                {
                    System.out.println("\nJogador 1 ganhou!");
                    break;
                }
                else if (countDPX == 3)
                {
                    System.out.println("\nJogador 2 ganhou!");
                    break;
                }
                else if (countDSO == 3)
                {
                    System.out.println("\nJogador 1 ganhou!");
                    break;
                }
                else if (countDSX == 3)
                {
                    System.out.println("\nJogador 2 ganhou!");
                    break;
                }

                for (int i = 0; i < jogoVelha.length; i++)
                {
                    if (countCO == 3)
                    {
                        break;
                    }
                    else if (countCX == 3)
                    {
                        break;
                    }

                    countCO = 0;
                    countCX = 0;

                    for (int j = 0; j < jogoVelha[i].length; j++)
                    {
                        if (jogoVelha[j][i].equals("O"))
                        {
                            countCO++;
                        }
                        else if (jogoVelha[j][i].equals("X"))
                        {
                            countCX++;
                        }
                    }
                }

                if (countCO == 3)
                {
                    System.out.println("\nJogador 1 ganhou!");
                    break;
                }
                else if (countCX == 3)
                {
                    System.out.println("\nJogador 2 ganhou!");
                    break;
                }
            }

            if (count == 8)
            {
                System.out.println("\nEmpate...");
                continuar = false;
            }
        }
        while (continuar);
    }
}