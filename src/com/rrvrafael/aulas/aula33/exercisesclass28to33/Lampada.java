package com.rrvrafael.aulas.aula33.exercisesclass28to33;

public class Lampada {

    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private String[] tipos;
    private boolean tipoAbajur;
    private boolean ligada;

    public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMeses, String[] tipos, boolean tipoAbajur, boolean ligada) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
        this.tipoAbajur = tipoAbajur;
        this.ligada = ligada;
    }

    public Lampada() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligarLampada()
    {
        this.ligada = true;
    }

    public void desligarLampada()
    {
        this.ligada = false;
    }

    public void mostrarEstado()
    {
        if (this.ligada)
        {
            System.out.println("A lâmpada está ligada!");
        }
        else
        {
            System.out.println("A lâmpada está desligada!");
        }
    }

    public void mudarEstado(String decisao)
    {
        if (decisao.equalsIgnoreCase("sim"))
        {
            ligarLampada();
        }
        else if (decisao.equalsIgnoreCase("não"))
        {
            desligarLampada();
        }
        else
        {
            System.out.println("Digite uma opção válida!");
        }
    }
}
