package com.rrvrafael.aulas.aula50;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args) {
        System.out.println("Digite um número decimal:");
        try {
            double numero = lerNumero();
            System.out.println("Você digitou o número: " + numero);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    }

    public static double lerNumero() throws Exception {
        Scanner scan = new Scanner(System.in);

        double numero;

        numero = scan.nextDouble();

        return numero;
    }
}
