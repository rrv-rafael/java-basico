package com.rrvrafael.aulas.aula42;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefoneCelular;
    private String telefoneFixo;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String endereco, String telefoneCelular, String telefoneFixo) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefoneCelular = telefoneCelular;
        this.telefoneFixo = telefoneFixo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    //public abstract String obterEtiquetaEndereco();

    //public abstract void imprimirEtiquetaEndereco();
}
