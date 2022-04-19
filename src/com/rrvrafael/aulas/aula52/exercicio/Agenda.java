package com.rrvrafael.aulas.aula52.exercicio;

public class Agenda {
    private final Contato[] contatos;

    public Agenda() {
        this.contatos = new Contato[2];
    }

    public void inserirContato(Contato contato) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = contato;
                break;
            }
        }
    }

    public Contato consultarContato(String nome) throws ContatoNaoExisteException {
        for (Contato c : contatos) {
            if (c != null) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    return c;
                }
            }
        }

        throw new ContatoNaoExisteException(nome);
    }

    public void verificarAgenda() throws AgendaCheiaException {
        int count = 0;

        for (Contato c : contatos) {
            if (c != null) {
                count++;
            }
        }

        if (count == contatos.length) {
            throw new AgendaCheiaException();
        }
    }

    @Override
    public String toString() {
        StringBuilder dados;

        dados = new StringBuilder();

        for (Contato contato : contatos) {
            if (contato != null) {
                dados.append("\nId: ").append(contato.getIdentificador()).append("\nNome: ").append(contato.getNome()).append("\nTelefone: ").append(contato.getTelefone()).append("\n");
            }
        }

        if (dados.toString().equals("")) {
            return null;
        }

        return "\nDados da Agenda:\nContatos:\n" + dados;
    }
}
