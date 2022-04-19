package com.rrvrafael.aulas.aula46.exercicios.ex03;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica {
    public Figura3D() {
    }

    public Figura3D(String nome, String cor) {
        super(nome, cor);
    }
}
