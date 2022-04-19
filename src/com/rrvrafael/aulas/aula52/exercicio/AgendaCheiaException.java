package com.rrvrafael.aulas.aula52.exercicio;

public class AgendaCheiaException extends Exception {
    @Override
    public String getMessage() {
        return "\nAgenda já está cheia.\n";
    }
}
