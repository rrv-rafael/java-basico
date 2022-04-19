package com.rrvrafael.aulas.aula46.exercicios.ex03;

public class Quadrado extends Figura2D {
    private double lado;

    public Quadrado() {
    }

    public Quadrado(String nome, String cor) {
        super(nome, cor);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
}
