package com.rrvrafael.aulas.aula34.exercicios.ex03;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int option, n1, n2;
        double num1, num2;

        System.out.println("*********Calculadora*********");
        System.out.println("1. Somar\n2. Subtrair\n3. Multiplicar\n4. Dividir\n5. Potência\n6. Fatorial");
        System.out.println("\nInforme a opção desejada:");
        option = scan.nextInt();


        if (option == 1) {
            System.out.println("Informe o 1o valor:");
            n1 = scan.nextInt();
            System.out.println("Informe o 2o valor:");
            n2 = scan.nextInt();

            System.out.println("Resultado da soma: " + Calculadora.somar(n1, n2));
        } else if (option == 2) {
            System.out.println("Informe o 1o valor:");
            n1 = scan.nextInt();
            System.out.println("Informe o 2o valor:");
            n2 = scan.nextInt();

            System.out.println("Resultado da subtração: " + Calculadora.subtrair(n1, n2));
        } else if (option == 3) {
            System.out.println("Informe o 1o valor:");
            n1 = scan.nextInt();
            System.out.println("Informe o 2o valor:");
            n2 = scan.nextInt();

            System.out.println("Resultado da multiplicação: " + Calculadora.multiplicar(n1, n2));
        } else if (option == 4) {
            System.out.println("Informe o valor do dividendo:");
            num1 = scan.nextDouble();
            System.out.println("Informe o valor do divisor:");
            num2 = scan.nextDouble();

            if (num2 == 0) {
                System.out.println("Não é possível divisão por 0!");
            } else {
                System.out.println("Resultado da divisão: " + Calculadora.dividir(num1, num2));
            }
        } else if (option == 5) {
            System.out.println("Informe o valor da base:");
            n1 = scan.nextInt();
            System.out.println("Informe o valor do expoente:");
            n2 = scan.nextInt();

            System.out.println("Resultado da potência: " + Calculadora.potencia(n1, n2));
        } else if (option == 6) {
            System.out.println("Informe o número que deseja obter o fatorial:");
            n1 = scan.nextInt();

            System.out.println("Fatorial do número " + n1 + ": " + Calculadora.fatorial(n1));
        } else {
            System.out.println("Digite uma opção válida!");
        }
    }
}
