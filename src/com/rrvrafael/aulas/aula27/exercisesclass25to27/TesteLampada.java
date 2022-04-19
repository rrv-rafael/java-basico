package com.rrvrafael.aulas.aula27.exercisesclass25to27;

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