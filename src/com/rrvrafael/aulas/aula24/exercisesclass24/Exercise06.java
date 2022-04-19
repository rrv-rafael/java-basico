package com.rrvrafael.aulas.aula24.exercisesclass24;

public class Exercise06 {

    public static void main(String[] args) {

        Contato contato1 = new Contato();

        contato1.nome = "João";
        contato1.endereco = "Av. Paulista, 1000";
        contato1.email = "joao@email.com";

        contato1.numTelefones = new String[5];

        contato1.numTelefones[0] = "99999-9999";
        contato1.numTelefones[1] = "99999-9998";
        contato1.numTelefones[2] = "99999-9997";
    }
}