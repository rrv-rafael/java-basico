package com.rrvrafael.aulas.aula46.exercicios.ex02;

public class Piramide extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {
    private double base;
    private double alturaBase;
    private double alturaVolume;

    public Piramide() {
    }

    public Piramide(double base, double alturaBase, double alturaVolume) {
        this.base = base;
        this.alturaBase = alturaBase;
        this.alturaVolume = alturaVolume;
    }

    public Piramide(String nome, String cor, double base, double alturaBase, double alturaVolume) {
        super(nome, cor);
        this.base = base;
        this.alturaBase = alturaBase;
        this.alturaVolume = alturaVolume;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAlturaBase() {
        return alturaBase;
    }

    public void setAlturaBase(double alturaBase) {
        this.alturaBase = alturaBase;
    }

    public double getAlturaVolume() {
        return alturaVolume;
    }

    public void setAlturaVolume(double alturaVolume) {
        this.alturaVolume = alturaVolume;
    }

    @Override
    public double calcularArea() {
        return (base * alturaBase) / 2;
    }

    @Override
    public double calcularVolume() {
        return (calcularArea() * alturaVolume) / 3;
    }
}
