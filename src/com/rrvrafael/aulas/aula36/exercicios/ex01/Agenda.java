package com.rrvrafael.aulas.aula36.exercicios.ex01;

public class Agenda {
    private String nome;
    private Contato[] contatos;

    public Agenda() {
    }

    public Agenda(String nome, Contato[] contatos) {
        this.nome = nome;
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String retornarContato(String contatoEspecifico) {
        for (Contato contato : contatos) {
            if (contatoEspecifico.equalsIgnoreCase(contato.getNome())) {
                //contatoEspecifico = "Nome: " + contato.getNome() + "\n" + "Telefone: " + contato.getTelefoneFixo() + "\n" + "E-mail: " + contato.getEmail();
                contatoEspecifico = contato.retornarContato();
                return contatoEspecifico;
            }
        }

        return "Esse contato não existe!";
    }

    public String retornarContatos() {
        StringBuilder retorno = new StringBuilder("\nNome da Agenda: " + this.nome + "\n\n");

        if (contatos != null) {
            for (Contato contato : contatos) {
                retorno.append(contato.retornarContato()).append("\n\n");
            }
        }

        return retorno.toString();
    }
}
