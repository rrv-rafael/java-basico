package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdTemp, temp, count = 0, maior = Integer.MIN_VALUE, menor = 0;
        double soma = 0, media;

        System.out.println("Por favor, informe a quantidade de temperaturas que irá inserir:");
        qtdTemp = scan.nextInt();

        while (count < qtdTemp)
        {
            count++;

            System.out.println("Informe a " + count + "a temperatura:");
            temp = scan.nextInt();

            if (count == 1)
            {
                menor = temp;
            }

            if (temp > maior)
            {
                maior = temp;
            }

            if (temp < menor)
            {
                menor = temp;
            }

            soma += temp;
        }

        media = soma / qtdTemp;

        System.out.println("A menor temperatura informada foi: " + menor);
        System.out.println("A maior temperatura informada foi: " + maior);
        System.out.println("A média das temperaturas informadas é: " + media);
    }
}