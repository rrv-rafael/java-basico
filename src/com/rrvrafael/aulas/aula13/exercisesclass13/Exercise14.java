package com.rrvrafael.aulas.aula13.exercisesclass13;

import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tamArquivo, velLinkInternet, tempoAproximado;

        System.out.println("Informe o tamanho do arquivo para download (em MB)");
        tamArquivo = scan.nextDouble();

        System.out.println("Informe a velocidade do link de Internet (em Mbps):");
        velLinkInternet = scan.nextDouble();

        //Mbps é Megabits por segundo
        //1 byte = 8 bits, divide Mbps por 8 que chega no MB por segundo

        System.out.println("MB por segundo: " + velLinkInternet / 8);

        tempoAproximado = tamArquivo / (velLinkInternet / 8);

        if (tempoAproximado < 60)
        {
            System.out.println("Tempo aproximado para o download: " + tempoAproximado + " segundos.");
        }
        else
        {
            System.out.println("Tempo aproximado para o download: " + tempoAproximado / 60 + " minutos.");
        }
    }
}