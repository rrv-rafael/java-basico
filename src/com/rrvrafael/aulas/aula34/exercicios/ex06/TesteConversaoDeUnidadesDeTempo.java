package com.rrvrafael.aulas.aula34.exercicios.ex06;

import java.util.Scanner;

public class TesteConversaoDeUnidadesDeTempo {
    public static void main(String[] args) {
        ConversaoDeUnidadesDeTempo conversao = new ConversaoDeUnidadesDeTempo();
        Scanner scan = new Scanner(System.in);

        int option, retorno;

        System.out.println("*****Conversor de unidades de tempo*****");
        System.out.println("1. Minuto p/ segundo\n2. Hora p/ minutos\n3. Dia p/ horas\n4. Semana p/ dias\n5. Mês p/ dias\n6. Ano p/ dias\n");
        System.out.println("Digite a opção desejada conforme acima:");
        option = scan.nextInt();

        if (option == 1) {
            System.out.println("Digite o número de minuto(s):");
            conversao.setMinuto(scan.nextInt());

            retorno = ConversaoDeUnidadesDeTempo.convertMinuto(conversao.getMinuto());

            System.out.println(conversao.getMinuto() + " minuto(s) equivale a " + retorno + " segundos.");
        } else if (option == 2) {
            System.out.println("Digite o número de hora(s):");
            conversao.setHora(scan.nextInt());

            retorno = ConversaoDeUnidadesDeTempo.convertHora(conversao.getHora());

            System.out.println(conversao.getHora() + " hora(s) equivale a " + retorno + " minutos.");
        } else if (option == 3) {
            System.out.println("Digite o número de dia(s):");
            conversao.setDia(scan.nextInt());

            retorno = ConversaoDeUnidadesDeTempo.convertDia(conversao.getDia());

            System.out.println(conversao.getDia() + " dia(s) equivale a " + retorno + " horas.");
        } else if (option == 4) {
            System.out.println("Digite o número de semana(s):");
            conversao.setSemana(scan.nextInt());

            retorno = ConversaoDeUnidadesDeTempo.convertSemana(conversao.getSemana());

            System.out.println(conversao.getSemana() + " semana(s) equivale a " + retorno + " dias.");
        } else if (option == 5) {
            System.out.println("Digite o número de meses:");
            conversao.setMes(scan.nextInt());

            retorno = ConversaoDeUnidadesDeTempo.convertMes(conversao.getMes());

            System.out.println(conversao.getMes() + " meses equivale a " + retorno + " dias.");
        } else if (option == 6) {
            System.out.println("Digite o número de ano(s):");
            conversao.setAno(scan.nextInt());

            retorno = ConversaoDeUnidadesDeTempo.convertAno(conversao.getAno());

            System.out.println(conversao.getAno() + " ano(s) equivale a " + retorno + " dias.");
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
