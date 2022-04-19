package com.rrvrafael.aulas.aula46.exercicios.ex02;

public class Circulo extends Figura2D implements DimensaoSuperficial {
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo(String nome, String cor, double raio) {
        super(nome, cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (Math.pow(raio, 2));
    }
}
