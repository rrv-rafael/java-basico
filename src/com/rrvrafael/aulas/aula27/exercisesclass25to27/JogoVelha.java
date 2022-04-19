package com.rrvrafael.aulas.aula27.exercisesclass25to27;

public class JogoVelha {

    String[][] jogoVelha;
    String jogada;
    int posicao = 0;
    int countO;
    int countX;
    int countLO;
    int countLX;
    int countDPO;
    int countDPX;
    int countDSO;
    int countDSX;
    int countCO;
    int countCX;

    void mostrarPosicoesJogoVelha()
    {
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
    }

    void preencherJogada(int count)
    {
        for (int i = 0; i < jogoVelha.length; i++)
        {
            for (int j = 0; j < jogoVelha[i].length; j++)
            {
                if (count % 2 != 0)
                {
                    if (jogada.equals(jogoVelha[i][j]))
                    {
                        jogoVelha[i][j] = "O";
                    }
                }
                else
                {
                    if (jogada.equals(jogoVelha[i][j]))
                    {
                        jogoVelha[i][j] = "X";
                    }
                }

                System.out.print(jogoVelha[i][j] + " ");
            }

            System.out.println();
        }
    }

    String verificarGanhador()
    {
        for (int i = 0; i < jogoVelha.length; i++)
        {
            countO = 0;
            countX = 0;

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

        if (countLO == 3 || countDPO == 3 || countDSO == 3 || countCO == 3)
        {
            return  "O";
        }
        else if (countLX == 3 || countDPX == 3 || countDSX == 3 || countCX == 3)
        {
            return "X";
        }

        return "E";
    }
}