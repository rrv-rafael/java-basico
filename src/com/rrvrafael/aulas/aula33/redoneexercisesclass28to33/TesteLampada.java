package com.rrvrafael.aulas.aula33.redoneexercisesclass28to33;

import java.util.Scanner;

public class TesteLampada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Lampada lampada = new Lampada();

        lampada.ligarLampada();
        lampada.mostrarEstado();
        lampada.desligarLampada();
        lampada.mostrarEstado();


        String decisao;

        System.out.println("Digite sim para ligar a lampada e não para desligar:");
        decisao = scan.next();

        lampada.mudarEstado(decisao);
        lampada.mostrarEstado();
    }
}
