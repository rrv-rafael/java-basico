package com.rrvrafael.aulas.aula52.exercicio;

public class ContatoNaoExisteException extends Exception {
    private final String nomeContato;

    public ContatoNaoExisteException(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    @Override
    public String getMessage() {
        return "\nO contato " + nomeContato + " não existe na agenda.\n";
    }
}
