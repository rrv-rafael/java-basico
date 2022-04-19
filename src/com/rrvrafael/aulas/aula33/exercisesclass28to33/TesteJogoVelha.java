package com.rrvrafael.aulas.aula33.exercisesclass28to33;

import java.util.Scanner;

public class TesteJogoVelha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JogoVelha jogoVelha = new JogoVelha();

        jogoVelha.setJogoVelha(new String[3][3]);

        int count = 0;
        String retornoVerificarGanhador = "E";

        System.out.println("Posições disponíveis para escolher:\n");

        jogoVelha.mostrarPosicoesJogoVelha();

        do
        {
            count++;

            if (count % 2 != 0)
            {
                System.out.println("\nJogador 1! Informe a posição que deseja colocar a O.");
            }
            else
            {
                System.out.println("\nJogador 2! Informe a posição que deseja colocar o X.");
            }

            jogoVelha.setJogada(scan.next());

            System.out.println("\nPosições disponíveis para escolher:\n");

            jogoVelha.preencherJogada(count);

            if (count > 4)
            {
                jogoVelha.setCountDPO(0);
                jogoVelha.setCountDPX(0);
                jogoVelha.setCountDSO(0);
                jogoVelha.setCountDSX(0);

                retornoVerificarGanhador = jogoVelha.verificarGanhador();

                if (retornoVerificarGanhador.equals("O"))
                {
                    System.out.println("\nJogador 1 ganhou!");
                }
                else if (retornoVerificarGanhador.equals("X"))
                {
                    System.out.println("\nJogador 2 ganhou!");
                }
            }

            if (count == 8 && retornoVerificarGanhador.equals("E"))
            {
                System.out.println("\nEmpate...");
            }
        }
        while (retornoVerificarGanhador.equals("E"));
    }
}
