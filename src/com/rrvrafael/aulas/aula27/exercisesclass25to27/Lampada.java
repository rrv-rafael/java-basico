package com.rrvrafael.aulas.aula27.exercisesclass25to27;

public class Lampada {

    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;
    boolean ligada;



    void ligarLampada()
    {
        ligada = true;
    }

    void desligarLampada()
    {
        ligada = false;
    }

    void mostrarEstado()
    {
        if (ligada)
        {
            System.out.println("A lâmpada está ligada!");
        }
        else
        {
            System.out.println("A lâmpada está desligada!");
        }
    }

    void mudarEstado(String decisao)
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
