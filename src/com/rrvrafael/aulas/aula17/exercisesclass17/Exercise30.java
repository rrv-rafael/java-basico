package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise30 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, comeco, fim, resultado;
        boolean invalido = true;

        System.out.println("Digite o número da tabuada que deseja:");
        numero = scan.nextInt();

        do
        {
            System.out.println("Informe o número que deseja que comece a tabuada:");
            comeco = scan.nextInt();

            System.out.println("Informe o número que deseja que termine a tabuada:");
            fim = scan.nextInt();

            if (fim > comeco)
            {
                invalido = false;
            }
            else
            {
                System.out.println("O número de término não pode ser menor que o de começo! Digite novamente.");
            }
        }
        while (invalido);

        System.out.println("\nMontar a tabuada de: " + numero);

        System.out.println("Começar por: " + comeco);
        System.out.println("Terminar em: " + fim);

        System.out.println("\nVou montar a tabuada de " + numero + " começando em " + comeco + " e terminando em " + fim + ":");

        for (int i = comeco; i <= fim; i++)
        {
            resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }
}