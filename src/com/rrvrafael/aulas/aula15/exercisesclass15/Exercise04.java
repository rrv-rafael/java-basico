package com.rrvrafael.aulas.aula15.exercisesclass15;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String letra;

        System.out.println("Digite uma letra:");
        letra = scan.nextLine();

        /*if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U"))
        {
            System.out.println("Você digitou uma vogal!");
        }
        else
        {
            System.out.println("Você digitou uma consoante!");
        }*/

        if (letra.length() == 1)
        {
            switch (letra) {
                case "A":
                case "a":
                case "E":
                case "e":
                case "I":
                case "i":
                case "O":
                case "o":
                case "U":
                case "u":
                    System.out.println("Você digitou uma vogal!");
                    break;
                default:
                    System.out.println("Você digitou uma consoante!");
                    break;
            }
        }
        else
        {
            System.out.println("Você não digitou apenas uma letra!");
        }
    }
}