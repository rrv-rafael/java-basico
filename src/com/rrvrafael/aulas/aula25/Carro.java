package com.rrvrafael.aulas.aula25;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    void exibirAutonomia()
    {
        System.out.println("A autonomia do carro é: " + (capacidadeCombustivel * consumoCombustivel) + " km");
    }
}