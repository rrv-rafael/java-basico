package com.rrvrafael.aulas.aula34.exercicios.ex05;

public class ConversaoDeUnidadesDeVolume {
    private double litro;
    private double metroCubico;
    private double galaoAmericano;

    public ConversaoDeUnidadesDeVolume() {
    }

    public ConversaoDeUnidadesDeVolume(double litro, double metroCubico, double galaoAmericano) {
        this.litro = litro;
        this.metroCubico = metroCubico;
        this.galaoAmericano = galaoAmericano;
    }

    public double getLitro() {
        return litro;
    }

    public void setLitro(double litro) {
        this.litro = litro;
    }

    public double getMetroCubico() {
        return metroCubico;
    }

    public void setMetroCubico(double metroCubico) {
        this.metroCubico = metroCubico;
    }

    public double getGalaoAmericano() {
        return galaoAmericano;
    }

    public void setGalaoAmericano(double galaoAmericano) {
        this.galaoAmericano = galaoAmericano;
    }

    public static double convertLitroToCentimetroCubico(double litro) {
        return litro * 1000;
    }

    public static double convertMetroCubicoToLitro(double metroCubico) {
        return metroCubico * 1000;
    }

    public static double convertMetroCubicoToPeCubico(double metroCubico) {
        return metroCubico * 35.32;
    }

    public static double convertGalaoAmericanoToPolegadaCubica(double galaoAmericano) {
        return galaoAmericano * 231;
    }

    public static double convertGalaoAmericanoToLitro(double galaoAmericano) {
        return galaoAmericano * 3785;
    }
}
