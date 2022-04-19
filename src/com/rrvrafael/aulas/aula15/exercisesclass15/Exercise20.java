package com.rrvrafael.aulas.aula15.exercisesclass15;

import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String resposta;
        int count = 0;

        System.out.println("Você telefonou para a vítima?");
        resposta = scan.next();
        if (resposta.equalsIgnoreCase("sim"))
        {
            count++;
        }

        System.out.println("Esteve no local do crime?");
        resposta = scan.next();
        if (resposta.equalsIgnoreCase("sim"))
        {
            count++;
        }

        System.out.println("Mora perto da vítima?");
        resposta = scan.next();
        if (resposta.equalsIgnoreCase("sim"))
        {
            count++;
        }

        System.out.println("Devia para a vítima?");
        resposta = scan.next();
        if (resposta.equalsIgnoreCase("sim"))
        {
            count++;
        }

        System.out.println("Já trabalhou com a vítima?");
        resposta = scan.next();
        if (resposta.equalsIgnoreCase("sim"))
        {
            count++;
        }

        if (count == 2)
        {
            System.out.println("Suspeita!");
        }
        else if (count > 2 && count < 5)
        {
            System.out.println("Cúmplice!");
        }
        else if (count == 5)
        {
            System.out.println("Assassino!");
        }
        else
        {
            System.out.println("Inocente!");
        }
    }
}