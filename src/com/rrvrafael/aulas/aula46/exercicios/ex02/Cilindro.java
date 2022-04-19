package com.rrvrafael.aulas.aula46.exercicios.ex02;

public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {
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
        return Math.PI * (Math.pow(raio, 2));
    }

    @Override
    public double calcularVolume() {
        return calcularArea() * altura;
    }
}
