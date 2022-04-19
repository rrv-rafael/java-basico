package com.rrvrafael.aulas.aula27;

import java.util.Scanner;

public class TesteCarro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autonomia;

        autonomia = van.obterAutonomia();

        System.out.println("Autonomia do carro é: " + autonomia);
        System.out.println("Autonomia do carro é: " + van.obterAutonomia());

        int km;
        double qtdCombustivel;

        System.out.println("Digite o km:");
        km = scan.nextInt();



        qtdCombustivel = van.calcularCombustivel(km);

        System.out.println("Para andar " + km + "km é necessário " + qtdCombustivel + " litros de combustível.");
    }
}