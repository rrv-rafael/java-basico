package com.rrvrafael.aulas.aula46.exercicios.ex03;

public class Piramide extends Figura3D {
    private double comprimentoArestaBase;
    private double altura;
    private double numeroArestasBase;

    public Piramide() {
    }

    public Piramide(double comprimentoArestaBase, double altura, double numeroArestasBase) {
        this.comprimentoArestaBase = comprimentoArestaBase;
        this.altura = altura;
        this.numeroArestasBase = numeroArestasBase;
    }

    public Piramide(String nome, String cor, double comprimentoArestaBase, double altura, double numeroArestasBase) {
        super(nome, cor);
        this.comprimentoArestaBase = comprimentoArestaBase;
        this.altura = altura;
        this.numeroArestasBase = numeroArestasBase;
    }

    public double getComprimentoArestaBase() {
        return comprimentoArestaBase;
    }

    public void setComprimentoArestaBase(double comprimentoArestaBase) {
        this.comprimentoArestaBase = comprimentoArestaBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getNumeroArestasBase() {
        return numeroArestasBase;
    }

    public void setNumeroArestasBase(double numeroArestasBase) {
        this.numeroArestasBase = numeroArestasBase;
    }

    public double calcularAreaBase() {
        if (numeroArestasBase == 4) {
            return Math.pow(comprimentoArestaBase, 2);
        }
        else if (numeroArestasBase == 3) {
            return (Math.pow(comprimentoArestaBase, 2) * Math.sqrt(3)) / 4;
        }

        return 0;
    }

    @Override
    public double calcularArea() {
        double areaLateral;

        areaLateral = numeroArestasBase * ((comprimentoArestaBase * altura) / 2);

        return calcularAreaBase() + areaLateral;
    }

    @Override
    public double calcularVolume() {
        return (calcularAreaBase() * altura) / 3;
    }
}
