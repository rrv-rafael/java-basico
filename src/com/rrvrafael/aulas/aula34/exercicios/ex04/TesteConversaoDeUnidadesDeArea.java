package com.rrvrafael.aulas.aula34.exercicios.ex04;

import java.util.Scanner;

public class TesteConversaoDeUnidadesDeArea {
    public static void main(String[] args) {
        ConversaoDeUnidadesDeArea conversao = new ConversaoDeUnidadesDeArea();
        Scanner scan = new Scanner(System.in);

        int option;
        double retorno;

        System.out.println("*****Conversor de unidades de área*****");
        System.out.println("1. M²\n2. Pé²\n3. Milha²\n4. Acre\n");
        System.out.println("Escolha a opção desejada:");
        option = scan.nextInt();

        if (option == 1) {
            System.out.println("Informe o valor do metro²:");
            conversao.setMetroQuadrado(scan.nextDouble());

            retorno = ConversaoDeUnidadesDeArea.convertMetroQuadrado(conversao.getMetroQuadrado());

            System.out.println(conversao.getMetroQuadrado() + "m² equivale a " + retorno + " pés quadrados.");
        } else if (option == 2) {
            System.out.println("Informe o valor do pé²:");
            conversao.setPeQuadrado(scan.nextDouble());

            retorno = ConversaoDeUnidadesDeArea.convertPeQuadrado(conversao.getPeQuadrado());

            System.out.println(conversao.getPeQuadrado() + " pé(s)² equivale a " + retorno + " centímetro(s)².");
        } else if (option == 3) {
            System.out.println("Informe o valor da milha²:");
            conversao.setMilhaQuadrada(scan.nextDouble());

            retorno = ConversaoDeUnidadesDeArea.convertMilhaQuadrada(conversao.getMilhaQuadrada());

            System.out.println(conversao.getMilhaQuadrada() + " milha(s)² esquile a " + retorno + " acre(s).");
        } else if (option == 4) {
            System.out.println("Informe o valor do acre:");
            conversao.setAcre(scan.nextDouble());

            retorno = ConversaoDeUnidadesDeArea.convertAcre(conversao.getAcre());

            System.out.println(conversao.getAcre() + " acre(s) equivale a " + retorno + " pé(s)².");
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
