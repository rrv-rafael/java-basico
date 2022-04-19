package com.rrvrafael.aulas.aula34.exercicios.ex01;

public class TesteContador {
    public static void main(String[] args) {
        System.out.println(Contador.retornar());
        Contador.incrementar();
        System.out.println(Contador.retornar());
        Contador.incrementar();
        Contador.incrementar();
        System.out.println(Contador.retornar());
        Contador.incrementar();
        System.out.println(Contador.retornar());
        Contador.zerar();
        System.out.println(Contador.retornar());
        Contador.incrementar();
        System.out.println(Contador.retornar());
        Contador.incrementar();
        Contador.incrementar();
        System.out.println(Contador.retornar());
    }
}
