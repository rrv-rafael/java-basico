package com.rrvrafael.aulas.aula33.redoneexercisesclass28to33;

public class JogoVelha {
    private final String[][] jogo;
    private String jogada;
    private int posicao;
    private int countLO;
    private int countLX;
    private int countDPO;
    private int countDPX;
    private int countDSO;
    private int countDSX;
    private int countCO;
    private int countCX;

    public JogoVelha() {
        jogo = new String[3][3];
        posicao = 0;
    }

    public void setJogada(String jogada) {
        this.jogada = jogada;
    }

    public void setCountDPO(int countDPO) {
        this.countDPO = countDPO;
    }

    public void setCountDPX(int countDPX) {
        this.countDPX = countDPX;
    }

    public void setCountDSO(int countDSO) {
        this.countDSO = countDSO;
    }

    public void setCountDSX(int countDSX) {
        this.countDSX = countDSX;
    }

    public void mostrarPosicoesJogoVelha() {
        for (int i = 0; i < this.jogo.length; i++) {
            for (int j = 0; j < this.jogo[i].length; j++) {
                this.posicao++;
                this.jogo[i][j] = Integer.toString(this.posicao);

                System.out.print(this.jogo[i][j] + " ");
            }

            System.out.println();
        }
    }

    public void preencherJogada(int count) {
        for (int i = 0; i < this.jogo.length; i++) {
            for (int j = 0; j < this.jogo[i].length; j++) {
                if (count % 2 != 0) {
                    if (this.jogada.equals(this.jogo[i][j])) {
                        this.jogo[i][j] = "O";
                    }
                } else {
                    if (this.jogada.equals(jogo[i][j])) {
                        this.jogo[i][j] = "X";
                    }
                }

                System.out.print(this.jogo[i][j] + " ");
            }

            System.out.println();
        }
    }

    public String verificarGanhador() {
        for (int i = 0; i < this.jogo.length; i++) {

            if (this.countCO == 3 || this.countCX == 3 || countLO == 3 || countLX == 3) {
                break;
            }

            this.countLO = 0;
            this.countLX = 0;
            this.countCO = 0;
            this.countCX = 0;

            for (int j = 0; j < this.jogo[i].length; j++) {
                if (this.jogo[i][j].equals("O")) {
                    countLO++;
                }
                else if (this.jogo[i][j].equals("X")) {
                    countLX++;
                }

                if (i == j) {
                    if (this.jogo[i][j].equals("O")) {
                        this.countDPO++;
                    } else if (this.jogo[i][j].equals("X")) {
                        this.countDPX++;
                    }
                }

                if ((i + j) == (this.jogo.length - 1)) {
                    if (this.jogo[i][j].equals("O")) {
                        this.countDSO++;
                    } else if (this.jogo[i][j].equals("X")) {
                        this.countDSX++;
                    }
                }

                if (this.jogo[j][i].equals("O")) {
                    this.countCO++;
                } else if (this.jogo[j][i].equals("X")) {
                    this.countCX++;
                }
            }
        }

        if (this.countLO == 3 || this.countDPO == 3 || this.countDSO == 3 || this.countCO == 3) {
            return  "O";
        } else if (this.countLX == 3 || this.countDPX == 3 || this.countDSX == 3 || this.countCX == 3) {
            return "X";
        }

        return "E";
    }
}
