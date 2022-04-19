package com.rrvrafael.aulas.aula46.exercicios.ex03;

public class Cilindro extends Figura3D {
    private double raio;
    private double altura;

    public Cilindro() {
    }

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public Cilindro(String nome, String cor, double raio, double altura) {
        super(nome, cor);
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double areaBase, areaLateral, areaTotal;

        areaBase = Math.PI * (Math.pow(raio, 2));
        areaLateral = (2 * Math.PI) * raio * altura;
        areaTotal = (2 * areaBase) + areaLateral;

        return areaTotal;
    }

    @Override
    public double calcularVolume() {
        return (Math.PI * (Math.pow(raio, 2))) * altura;
    }
}
