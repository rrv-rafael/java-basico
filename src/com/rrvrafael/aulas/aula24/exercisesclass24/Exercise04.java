package com.rrvrafael.aulas.aula24.exercisesclass24;

import java.util.Date;

public class Exercise04 {

    public static void main(String[] args) {

        LivroBiblioteca livro = new LivroBiblioteca();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        livro.emprestado = true;
        livro.dataEntrega = new Date();

        livro.emprestadoA = "Loiane";

        System.out.println("Nome do livro: " + livro.nome);
    }
}