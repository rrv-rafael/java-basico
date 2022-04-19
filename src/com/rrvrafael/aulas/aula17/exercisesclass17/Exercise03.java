package com.rrvrafael.aulas.aula17.exercisesclass17;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        boolean infoValida = false;

        do
        {
            System.out.println("Informe seu nome:");
            nome = scan.next();

            if (nome.length() > 3)
            {
                infoValida = true;
            }
            else
            {
                System.out.println("Nome inválido! O nome deve conter no minímo 3 caracteres. Digite novamente.");
            }
        }
        while (!infoValida);

        infoValida = false;

        do
        {
            System.out.println("Informe sua idade:");
            idade = scan.nextInt();

            if (idade > 0 && idade < 150)
            {
                infoValida = true;
            }
            else
            {
                System.out.println("Idade inválida! A idade não pode ser menor que 0 nem maior que 150! Por favor, digite novamente.");
            }
        }
        while (!infoValida);

        infoValida = false;

        do
        {
            System.out.println("Informe seu salário:");
            salario = scan.nextDouble();

            if (salario > 0)
            {
                infoValida = true;
            }
            else
            {
                System.out.println("Salário inválido! O salário deve ser maior que 0! Por favor, digite novamente.");
            }
        }
        while (!infoValida);

        infoValida = false;

        do
        {
            System.out.println("Informe seu sexo:");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m"))
            {
                infoValida = true;
            }
            else
            {
                System.out.println("Sexo inválido! Você deve digitar F - Feminino ou M - Masculino! Por favor, digite novamente.");
            }
        }
        while (!infoValida);

        infoValida = false;

        do
        {
            System.out.println("Informe seu estado civil:");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d"))
            {
                infoValida = true;
            }
            else
            {
                System.out.println("Estado civil inválido! Você deve digitar S - Solteiro(a) | C - Casado(a) | V - Viúvo(a) | D - Divorciado(a)! Por favor, digite novamente.");
            }
        }
        while (!infoValida);

        System.out.println("Informações preenchidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
    }
}