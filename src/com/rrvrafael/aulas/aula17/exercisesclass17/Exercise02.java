package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String user, password;

        do
        {
            System.out.println("Informe seu usuário:");
            user = scan.next();
            System.out.println("Informe sua senha:");
            password = scan.next();

            if (user.equalsIgnoreCase(password))
            {
                System.out.println("Erro! O usuário e senha não podem ser iguais! Digite novamente.");
            }
            else
            {
                System.out.println("Usuário e senha válidos!");
            }
        }
        while (user.equalsIgnoreCase(password));
    }
}