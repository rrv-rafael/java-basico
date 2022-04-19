package com.rrvrafael.aulas.aula52.exercicio;

public class Contato {
    private String nome;
    private String telefone;
    private final int identificador;
    private static int count = 0;

    public Contato() {
        count++;
        this.identificador = count;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return "\nDados do Contato desejado:\n" + "Id: " + identificador + "\nNome: " + nome + "\n" + "Telefone: " + telefone + "\n";
    }
}
