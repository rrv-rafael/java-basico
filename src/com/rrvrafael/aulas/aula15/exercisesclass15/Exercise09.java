package com.rrvrafael.aulas.aula15.exercisesclass15;

import java.util.Scanner;

public class Exercise09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Digite o 1o número:");
        n1 = scan.nextInt();
        System.out.println("Digite o 2o número:");
        n2 = scan.nextInt();
        System.out.println("Digite o 3o número:");
        n3 = scan.nextInt();

        if (n1 < n2 && n2 < n3)
        {
            System.out.println("Números digitados em ordem decrescente: " + n3 + " " + n2 + " " + n1);
        }
        else if (n1 < n3 && n3 < n2)
        {
            System.out.println("Números digitados em ordem decrescente: " + n2 + " " + n3 + " " + n1);
        }
        else if (n2 < n1 && n1 < n3)
        {
            System.out.println("Números digitados em ordem decrescente: " + n3 + " " + n1 + " " + n2);
        }
        else if (n2 < n3 && n3 < n1)
        {
            System.out.println("Números digitados em ordem decrescente: " + n1 + " " + n3 + " " + n2);
        }
        else if (n3 < n1 && n1 < n2)
        {
            System.out.println("Números digitados em ordem decrescente: " + n2 + " " + n1 + " " + n3);
        }
        else
        {
            System.out.println("Números digitados em ordem decrescente: " + n1 + " " + n2 + " " + n3);
        }



        /*if (n1 < n2 && n1 < n3)
        {
            if (n2 < n3)
            {
                System.out.println("Números digitados em ordem decrescente: " + n3 + " " + n2 + " " + n1);
            }
            else
            {
                System.out.println("Números digitados em ordem decrescente: " + n2 + " " + n3 + " " + n1);
            }
        }
        else if (n2 < n1 && n2 < n3)
        {
            if (n1 < n3)
            {
                System.out.println("Números digitados em ordem decrescente: " + n3 + " " + n1 + " " + n2);
            }
            else
            {
                System.out.println("Números digitados em ordem decrescente: " + n1 + " " + n3 + " " + n2);
            }
        }
        else
        {
            if (n1 < n2)
            {
                System.out.println("Números digitados em ordem decrescente: " + n2 + " " + n1 + " " + n3);
            }
            else
            {
                System.out.println("Números digitados em ordem decrescente: " + n1 + " " + n2 + " " + n3);
            }
        }*/
    }
}