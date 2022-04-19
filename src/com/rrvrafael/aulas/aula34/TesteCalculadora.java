package com.rrvrafael.aulas.aula34;

import java.util.Scanner;

public class TesteCalculadora {

    static int resultado;

    public static void main(String[] args) {
        //Calculadora calculadora = new Calculadora();

        //calculadora.soma(1, 2);

        Scanner scan = new Scanner(System.in);

        resultado = Calculadora.soma(1, 2);

        System.out.println("Resultado da soma dos valores no parâmetro: " + resultado);

        int n1, n2;

        System.out.println("Informe um valor para n1:");
        n1 = scan.nextInt();
        System.out.println("Informe um valor para n2:");
        n2 = scan.nextInt();

        resultado = somarDoisValores(n1, n2);

        System.out.println("Resultado da soma dos valores digitados: " + resultado);
    }

    static int somarDoisValores(int n1, int n2) {
        return Calculadora.soma(n1, n2);
    }
}
