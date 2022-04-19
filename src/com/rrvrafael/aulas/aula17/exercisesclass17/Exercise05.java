package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double populacaoA, populacaoB, taxaCrescA, taxaCrescB;
        int countAnos = 0;
        boolean validarDado = false;

        do
        {
            System.out.println("Informe a população do País A:");
            populacaoA = scan.nextDouble();

            if (populacaoA > 0)
            {
                validarDado = true;
            }
            else
            {
                System.out.println("Valor inválido! Digite novamente.");
            }
        }
        while (!validarDado);

        validarDado = false;

        do
        {
            System.out.println("Informe a taxa de crescimento da população do País A:");
            taxaCrescA = scan.nextDouble();

            if (taxaCrescA > 0)
            {
                validarDado = true;
            }
            else
            {
                System.out.println("Valor inválido! Digite novamente.");
            }
        }
        while (!validarDado);

        validarDado = false;

        do
        {
            System.out.println("Informe a população do País B:");
            populacaoB = scan.nextDouble();

            if (populacaoB > 0)
            {
                validarDado = true;
            }
            else
            {
                System.out.println("Valor inválido! Digite novamente.");
            }
        }
        while (!validarDado);

        validarDado = false;

        do
        {
            System.out.println("Informe a taxa de crescimento da população do País B:");
            taxaCrescB = scan.nextDouble();

            if (taxaCrescB > 0 && taxaCrescB < taxaCrescA)
            {
                validarDado = true;
            }
            else
            {
                System.out.println("Valor inválido! Digite novamente.");
            }
        }
        while (!validarDado);

        while (populacaoA <= populacaoB)
        {
            populacaoA = populacaoA + ((populacaoA / 100) * taxaCrescA);
            populacaoB = populacaoB + ((populacaoB / 100) * taxaCrescB);
            countAnos++;
        }

        System.out.println("População A: " + populacaoA);
        System.out.println("População B: " + populacaoB);
        System.out.println("Serão necessários " + countAnos + " anos para a população do país A passar a de B!");
    }
}