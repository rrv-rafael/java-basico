package com.rrvrafael.aulas.aula24.exercisesclass24;

public class Exercise03 {

    public static void main(String[] args) {

        LivroLivraria livro = new LivroLivraria();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;
        livro.preco = 63.39;

        System.out.println("Nome do livro: " + livro.nome);
        System.out.println("Autor do livro: " + livro.autor);
    }
}