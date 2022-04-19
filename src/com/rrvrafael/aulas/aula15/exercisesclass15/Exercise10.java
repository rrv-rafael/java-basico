package com.rrvrafael.aulas.aula15.exercisesclass15;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String turno;

        System.out.println("Em que turno você estuda? Digite M p/ Matutino, V p/ Vespertino e N p/ Noturno.");
        turno = scan.nextLine();

        switch (turno)
        {
            case "M":
            case "m":
                System.out.println("Bom Dia!");
                break;
            case "V":
            case "v":
                System.out.println("Boa Tarde!");
                break;
            case "N":
            case "n":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Inválido!");
        }
    }
}