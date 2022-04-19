package com.rrvrafael.aulas.aula31;

public class TesteCarro {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.marca = "Fiat";

        double km = 10;

        carro.calcularCombustivel(km);
    }
}
