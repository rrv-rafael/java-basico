package com.rrvrafael.aulas.aula46.exercicios.ex03;

public class Teste {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        Cubo cubo = new Cubo();
        Cilindro cilindro = new Cilindro();
        Piramide piramide = new Piramide();
        FiguraGeometrica[] figurasGeometricas = new FiguraGeometrica[6];

        circulo.setRaio(2);
        circulo.setNome("Círculo");

        quadrado.setLado(2);
        quadrado.setNome("Quadrado");

        triangulo.setBase(3);
        triangulo.setAltura(2);
        triangulo.setNome("Triângulo");

        cubo.setAresta(3);
        cubo.setNome("Cubo");

        cilindro.setAltura(3);
        cilindro.setRaio(2);
        cilindro.setNome("Cilindro");

        piramide.setNumeroArestasBase(4);
        piramide.setComprimentoArestaBase(2);
        piramide.setAltura(3);
        piramide.setNome("Pirâmide");

        figurasGeometricas[0] = circulo;
        figurasGeometricas[1] = quadrado;
        figurasGeometricas[2] = triangulo;
        figurasGeometricas[3] = cubo;
        figurasGeometricas[4] = cilindro;
        figurasGeometricas[5] = piramide;


        for (FiguraGeometrica figurageometrica : figurasGeometricas) {
            System.out.println("-----------------------------------");
            System.out.println(figurageometrica.getNome());

            if (figurageometrica instanceof Figura2D figura2D) {
                System.out.println("Área: " + figura2D.calcularArea());
            } else if (figurageometrica instanceof Figura3D figura3D) {
                System.out.println("Área: " + figura3D.calcularArea());
                System.out.println("Volume: " + figura3D.calcularVolume());
            }
        }
    }
}
