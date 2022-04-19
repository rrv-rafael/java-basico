package com.rrvrafael.aulas.aula43.exercicios.ex03;

public class Peixe extends Animal {
    private String caracteristicas;

    public Peixe() {
        this.caracteristicas = "barbatanas e cauda";
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCaracterísticas: " + caracteristicas;
    }
}
