package com.rrvrafael.aulas.aula43.exercicios.ex02;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Contribuinte[] contribuintes = new Contribuinte[6];
        PessoaFisica contribuintePF;
        PessoaJuridica contribuintePJ;

        for (int i = 0; i < contribuintes.length; i++) {

            if (i < 3) {
                contribuintePF = new PessoaFisica();

                System.out.println("Informe o nome da pessoa física: ");
                contribuintePF.setNome(scan.next());

                System.out.println("Informe a renda bruta: ");
                contribuintePF.setRendaBruta(scan.nextDouble());

                System.out.println("Informe o CPF: ");
                contribuintePF.setCpf(scan.next());
                System.out.println();

                contribuintes[i] = contribuintePF;
            } else {
                contribuintePJ = new PessoaJuridica();

                System.out.println("Informe o nome da pessoa jurídica: ");
                contribuintePJ.setNome(scan.next());

                System.out.println("Informe a renda bruta: ");
                contribuintePJ.setRendaBruta(scan.nextDouble());

                System.out.println("Informe o CNPJ: ");
                contribuintePJ.setCnjp(scan.next());
                System.out.println();

                contribuintes[i] = contribuintePJ;
            }
        }

        for (Contribuinte contribuinte : contribuintes) {
            System.out.println("\n" + contribuinte);
        }

        /*PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Contribuinte 1");
        p1.setRendaBruta(1000);
        p1.setCpf("583.358.456-62");

        PessoaFisica p2 = new PessoaFisica();
        p2.setNome("Contribuinte 2");
        p2.setRendaBruta(2000);
        p2.setCpf("828.277.078-70");

        PessoaFisica p3 = new PessoaFisica();
        p3.setNome("Contribuinte 3");
        p3.setRendaBruta(3700);
        p3.setCpf("547.653.548-90");

        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("Contribuinte 4");
        p4.setRendaBruta(5000);
        p4.setCnjp("91.403.512/0001-54");

        PessoaJuridica p5 = new PessoaJuridica();
        p5.setNome("Contribuinte 5");
        p5.setRendaBruta(3000);
        p5.setCnjp("10.684.822/0001-92");

        PessoaJuridica p6 = new PessoaJuridica();
        p6.setNome("Contribuinte 6");
        p6.setRendaBruta(4000);
        p6.setCnjp("35.434.693/0001-05");*/
    }
}
