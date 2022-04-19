package com.rrvrafael.aulas.aula34.exercicios.ex05;

import java.util.Scanner;

public class TesteConversaoDeUnidadesDeVolume {
    public static void main(String[] args) {
        ConversaoDeUnidadesDeVolume conversao = new ConversaoDeUnidadesDeVolume();
        Scanner scan = new Scanner(System.in);

        int option;
        double retorno;

        System.out.println("******Conversor de unidades de volume******");
        System.out.println("1. Litro p/ Centímetro Cúbico\n2. Metro Cúbico p/ Litro\n3. Metro Cúbico p/ Pé Cúbico\n4. Galão Americano p/ Polegada Cúbica\n5. Galão Americano p/ Litro\n");
        System.out.println("Digite a opção desejada conforme acima:");
        option = scan.nextInt();

        if (option == 1) {
            System.out.println("Informe a quantidade de litro(s):");
            conversao.setLitro(scan.nextDouble());

            retorno = ConversaoDeUnidadesDeVolume.convertLitroToCentimetroCubico(conversao.getLitro());

            System.out.println(conversao.getLitro() + " litro(s) equivale a " + retorno + " centímetro(s) cúbico(s).");
        } else if (option == 2) {
            System.out.println("Informe o valor do metro cúbico:");
            conversao.setMetroCubico(scan.nextDouble());

            retorno = ConversaoDeUnidadesDeVolume.convertMetroCubicoToLitro(conversao.getMetroCubico());

            System.out.println(conversao.getMetroCubico() + " metro(s) cúbico(s) equivale a " + retorno + " litro(s).");
        } else if (option == 3) {
            System.out.println("Informe o valor do metro cúbico:");
            conversao.setMetroCubico(scan.nextDouble());

            retorno = ConversaoDeUnidadesDeVolume.convertMetroCubicoToPeCubico(conversao.getMetroCubico());

            System.out.println(conversao.getMetroCubico() + " metro(s) cúbico(s) equivale a " + retorno + " pé(s) cúbico(s).");
        } else if (option == 4) {
            System.out.println("Informe a quantidade do galão americano:");
            conversao.setGalaoAmericano(scan.nextDouble());

            retorno = ConversaoDeUnidadesDeVolume.convertGalaoAmericanoToPolegadaCubica(conversao.getGalaoAmericano());

            System.out.println(conversao.getGalaoAmericano() + " galão americano equivale a " + retorno + " polegada(s) cúbica(s).");
        } else if (option == 5) {
            System.out.println("Informe a quantidade do galão americano:");
            conversao.setGalaoAmericano(scan.nextDouble());

            retorno = ConversaoDeUnidadesDeVolume.convertGalaoAmericanoToLitro(conversao.getGalaoAmericano());

            System.out.println(conversao.getGalaoAmericano() + " galão americano equivale a " + retorno + " litro(s).");
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
