package com.rrvrafael.aulas.aula33.exercisesclass28to33;

public class JogoVelha {
    private String[][] jogoVelha;
    private String jogada;
    private int posicao = 0;
    private int countO;
    private int countX;
    private int countLO;
    private int countLX;
    private int countDPO;
    private int countDPX;
    private int countDSO;
    private int countDSX;
    private int countCO;
    private int countCX;

    public JogoVelha(String[][] jogoVelha, String jogada, int posicao, int countO, int countX, int countLO, int countLX, int countDPO, int countDPX, int countDSO, int countDSX, int countCO, int countCX) {
        this.jogoVelha = jogoVelha;
        this.jogada = jogada;
        this.posicao = posicao;
        this.countO = countO;
        this.countX = countX;
        this.countLO = countLO;
        this.countLX = countLX;
        this.countDPO = countDPO;
        this.countDPX = countDPX;
        this.countDSO = countDSO;
        this.countDSX = countDSX;
        this.countCO = countCO;
        this.countCX = countCX;
    }

    public JogoVelha() {
    }

    public String[][] getJogoVelha() {
        return jogoVelha;
    }

    public void setJogoVelha(String[][] jogoVelha) {
        this.jogoVelha = jogoVelha;
    }

    public String getJogada() {
        return jogada;
    }

    public void setJogada(String jogada) {
        this.jogada = jogada;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public int getCountO() {
        return countO;
    }

    public void setCountO(int countO) {
        this.countO = countO;
    }

    public int getCountX() {
        return countX;
    }

    public void setCountX(int countX) {
        this.countX = countX;
    }

    public int getCountLO() {
        return countLO;
    }

    public void setCountLO(int countLO) {
        this.countLO = countLO;
    }

    public int getCountLX() {
        return countLX;
    }

    public void setCountLX(int countLX) {
        this.countLX = countLX;
    }

    public int getCountDPO() {
        return countDPO;
    }

    public void setCountDPO(int countDPO) {
        this.countDPO = countDPO;
    }

    public int getCountDPX() {
        return countDPX;
    }

    public void setCountDPX(int countDPX) {
        this.countDPX = countDPX;
    }

    public int getCountDSO() {
        return countDSO;
    }

    public void setCountDSO(int countDSO) {
        this.countDSO = countDSO;
    }

    public int getCountDSX() {
        return countDSX;
    }

    public void setCountDSX(int countDSX) {
        this.countDSX = countDSX;
    }

    public int getCountCO() {
        return countCO;
    }

    public void setCountCO(int countCO) {
        this.countCO = countCO;
    }

    public int getCountCX() {
        return countCX;
    }

    public void setCountCX(int countCX) {
        this.countCX = countCX;
    }

    public void mostrarPosicoesJogoVelha()
    {
        for (int i = 0; i < this.jogoVelha.length; i++)
        {
            for (int j = 0; j < this.jogoVelha[i].length; j++)
            {
                this.posicao++;
                this.jogoVelha[i][j] = Integer.toString(this.posicao);

                System.out.print(this.jogoVelha[i][j] + " ");
            }

            System.out.println();
        }
    }

    public void preencherJogada(int count)
    {
        for (int i = 0; i < this.jogoVelha.length; i++)
        {
            for (int j = 0; j < this.jogoVelha[i].length; j++)
            {
                if (count % 2 != 0)
                {
                    if (this.jogada.equals(this.jogoVelha[i][j]))
                    {
                        this.jogoVelha[i][j] = "O";
                    }
                }
                else
                {
                    if (this.jogada.equals(this.jogoVelha[i][j]))
                    {
                        this.jogoVelha[i][j] = "X";
                    }
                }

                System.out.print(this.jogoVelha[i][j] + " ");
            }

            System.out.println();
        }
    }

    public String verificarGanhador()
    {
        for (int i = 0; i < this.jogoVelha.length; i++)
        {
            this.countO = 0;
            this.countX = 0;

            if (this.countCO == 3)
            {
                break;
            }
            else if (this.countCX == 3)
            {
                break;
            }

            this.countCO = 0;
            this.countCX = 0;

            for (int j = 0; j < this.jogoVelha[i].length; j++)
            {
                if (this.jogoVelha[i][j].equals("O"))
                {
                    this.countO++;
                    this.countLO = countO;
                }
                else if (this.jogoVelha[i][j].equals("X"))
                {
                    this.countX++;
                    this.countLX = this.countX;
                }

                if (i == j)
                {
                    if (this.jogoVelha[i][j].equals("O"))
                    {
                        this.countDPO++;
                    }
                    else if (this.jogoVelha[i][j].equals("X"))
                    {
                        this.countDPX++;
                    }
                }

                if ((i + j) == (this.jogoVelha.length - 1))
                {
                    if (this.jogoVelha[i][j].equals("O"))
                    {
                        this.countDSO++;
                    }
                    else if (this.jogoVelha[i][j].equals("X"))
                    {
                        this.countDSX++;
                    }
                }

                if (this.jogoVelha[j][i].equals("O"))
                {
                    this.countCO++;
                }
                else if (this.jogoVelha[j][i].equals("X"))
                {
                    this.countCX++;
                }
            }
        }

        if (this.countLO == 3 || this.countDPO == 3 || this.countDSO == 3 || this.countCO == 3)
        {
            return  "O";
        }
        else if (this.countLX == 3 || this.countDPX == 3 || this.countDSX == 3 || this.countCX == 3)
        {
            return "X";
        }

        return "E";
    }
}
