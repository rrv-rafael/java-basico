package com.rrvrafael.aulas.aula33.redoneexercisesclass28to33;

import java.util.Scanner;

public class TesteJogoVelha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        JogoVelha jogo = new JogoVelha();

        int count = 0;
        String retornoVerificarGanhador = "E";

        System.out.println("Posições disponíveis para escolher:\n");

        jogo.mostrarPosicoesJogoVelha();

        do {
            count++;

            if (count % 2 != 0) {
                System.out.println("\nJogador 1! Informe a posição que deseja colocar a O.");
            }
            else {
                System.out.println("\nJogador 2! Informe a posição que deseja colocar o X.");
            }

            jogo.setJogada(scan.next());

            System.out.println("\nPosições disponíveis para escolher:\n");

            jogo.preencherJogada(count);

            if (count > 4) {
                jogo.setCountDPO(0);
                jogo.setCountDPX(0);
                jogo.setCountDSO(0);
                jogo.setCountDSX(0);

                retornoVerificarGanhador = jogo.verificarGanhador();

                if (retornoVerificarGanhador.equals("O")) {
                    System.out.println("\nJogador 1 ganhou!");
                } else if (retornoVerificarGanhador.equals("X")) {
                    System.out.println("\nJogador 2 ganhou!");
                }
            }

            if (count == 8 && retornoVerificarGanhador.equals("E")) {
                System.out.println("\nEmpate...");
                break;
            }
        }
        while (retornoVerificarGanhador.equals("E"));
    }
}
