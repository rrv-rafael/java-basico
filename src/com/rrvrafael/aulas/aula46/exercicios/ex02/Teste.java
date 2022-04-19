package com.rrvrafael.aulas.aula46.exercicios.ex02;

public class Teste {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        Cubo cubo = new Cubo();
        Cilindro cilindro = new Cilindro();
        Piramide piramide = new Piramide();
        FiguraGeometrica[] figurasGeometricas = new FiguraGeometrica[6];

        circulo.setRaio(5);

        quadrado.setLado(12);

        triangulo.setBase(5);
        triangulo.setAltura(4);

        cubo.setAresta(10);

        cilindro.setAltura(5);
        cilindro.setRaio(4);

        piramide.setBase(4);
        piramide.setAlturaBase(2);
        piramide.setAlturaVolume(5);

        figurasGeometricas[0] = circulo;
        figurasGeometricas[1] = quadrado;
        figurasGeometricas[2] = triangulo;
        figurasGeometricas[3] = cubo;
        figurasGeometricas[4] = cilindro;
        figurasGeometricas[5] = piramide;


        for (FiguraGeometrica figurageometrica : figurasGeometricas) {
            if (figurageometrica instanceof Circulo) {
                System.out.println("Área do circulo: " + circulo.calcularArea());
            } else if (figurageometrica instanceof Quadrado) {
                System.out.println("\nÁrea do quadrado: " + quadrado.calcularArea());
            } else if (figurageometrica instanceof Triangulo) {
                System.out.println("\nÁrea do triângulo: " + triangulo.calcularArea());
            } else if (figurageometrica instanceof Cubo) {
                System.out.println("\nÁrea do cubo: " + cubo.calcularArea());
                System.out.println("Volume do cubo: " + cubo.calcularVolume());
            } else if (figurageometrica instanceof Cilindro) {
                System.out.println("\nÁrea do cilindro: " + cilindro.calcularArea());
                System.out.println("Volume do cilindro: " + cilindro.calcularVolume());
            } else {
                System.out.println("\nÁrea da pirâmide: " + piramide.calcularArea());
                System.out.println("Volume da pirâmide: " + piramide.calcularVolume());
            }
        }
    }
}
