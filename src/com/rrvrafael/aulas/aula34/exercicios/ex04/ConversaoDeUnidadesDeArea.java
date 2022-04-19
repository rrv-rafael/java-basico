package com.rrvrafael.aulas.aula34.exercicios.ex04;

public class ConversaoDeUnidadesDeArea {
    private double metroQuadrado;
    private double peQuadrado;
    private double milhaQuadrada;
    private double acre;

    public ConversaoDeUnidadesDeArea() {
    }

    public ConversaoDeUnidadesDeArea(double metroQuadrado, double peQuadrado, double milhaQuadrada, double acre) {
        this.metroQuadrado = metroQuadrado;
        this.peQuadrado = peQuadrado;
        this.milhaQuadrada = milhaQuadrada;
        this.acre = acre;
    }

    public double getMetroQuadrado() {
        return metroQuadrado;
    }

    public void setMetroQuadrado(double metroQuadrado) {
        this.metroQuadrado = metroQuadrado;
    }

    public double getPeQuadrado() {
        return peQuadrado;
    }

    public void setPeQuadrado(double peQuadrado) {
        this.peQuadrado = peQuadrado;
    }

    public double getMilhaQuadrada() {
        return milhaQuadrada;
    }

    public void setMilhaQuadrada(double milhaQuadrada) {
        this.milhaQuadrada = milhaQuadrada;
    }

    public double getAcre() {
        return acre;
    }

    public void setAcre(double acre) {
        this.acre = acre;
    }

    public static double convertMetroQuadrado(double metroQuadrado) {
        return metroQuadrado * 10.76;
    }

    public static double convertPeQuadrado(double peQuadrado) {
        return peQuadrado * 929;
    }

    public static double convertMilhaQuadrada(double milhaQuadrada) {
        return milhaQuadrada * 640;
    }

    public static double convertAcre(double acre) {
        return acre * 43560;
    }
}
