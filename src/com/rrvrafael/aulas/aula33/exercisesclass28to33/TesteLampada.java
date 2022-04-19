package com.rrvrafael.aulas.aula33.exercisesclass28to33;

import java.util.Scanner;

public class TesteLampada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Lampada lampada = new Lampada();

        int option;

        System.out.println("Digite 0 para verificar o estado da lâmpada, 1 para ligar e 2 para desligar:");
        option = scan.nextInt();

        if (option == 0) {
            lampada.mostrarEstado();
        } else if (option == 1) {
            lampada.ligarLampada();
            lampada.mostrarEstado();
        } else if (option == 2) {
            lampada.desligarLampada();
            lampada.mostrarEstado();
        }
    }
}
