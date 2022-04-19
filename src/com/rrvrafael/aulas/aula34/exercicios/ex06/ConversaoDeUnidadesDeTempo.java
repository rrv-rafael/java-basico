package com.rrvrafael.aulas.aula34.exercicios.ex06;

public class ConversaoDeUnidadesDeTempo {
    private int minuto;
    private int hora;
    private int dia;
    private int semana;
    private int mes;
    private int ano;

    public ConversaoDeUnidadesDeTempo() {
    }

    public ConversaoDeUnidadesDeTempo(int minuto, int hora, int dia, int semana, int mes, int ano) {
        this.minuto = minuto;
        this.hora = hora;
        this.dia = dia;
        this.semana = semana;
        this.mes = mes;
        this.ano = ano;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getSemana() {
        return semana;
    }

    public void setSemana(int semana) {
        this.semana = semana;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static int convertMinuto(int minuto) {
        return minuto * 60;
    }

    public static int convertHora(int hora) {
        return hora * 60;
    }

    public static int convertDia(int dia) {
        return dia * 24;
    }

    public static int convertSemana(int semana) {
        return semana * 7;
    }

    public static int convertMes(int mes) {
        return mes * 30;
    }

    public static int convertAno(int ano) {
        return ano * 365;
    }
}
