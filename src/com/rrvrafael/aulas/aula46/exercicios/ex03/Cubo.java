package com.rrvrafael.aulas.aula46.exercicios.ex03;

public class Cubo extends Figura3D {
    private double aresta;

    public Cubo() {
    }

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    public Cubo(String nome, String cor, double aresta) {
        super(nome, cor);
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcularArea() {
        return (Math.pow(aresta, 2)) * 6;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(aresta, 3);
    }
}
