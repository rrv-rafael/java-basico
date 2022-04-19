package com.rrvrafael.aulas.aula36.exercicios.ex01;

import java.util.Scanner;

public class TesteEx01 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contato contato;
        Contato[] contatos = new Contato[3];

        Scanner scan = new Scanner(System.in);

        System.out.println("******Cadastro de contatos na Agenda******");

        System.out.println("\nInforme o nome da agenda:");
        agenda.setNome(scan.nextLine());

        for (int i = 0; i < contatos.length; i++) {
            contato = new Contato();
            System.out.println("\nDigite o nome do contato:");
            contato.setNome(scan.nextLine());
            System.out.println("Digite o telefone:");
            contato.setTelefone(scan.nextLine());
            System.out.println("Digite o e-mail:");
            contato.setEmail(scan.nextLine());
            contatos[i] = contato;
        }

        agenda.setContatos(contatos);

        int option;

        System.out.println("\n1. Exibir todos os contatos\n2. Exibir um contato específico\nInforme a opção desejada:");
        option = scan.nextInt();
        scan.nextLine();

        if (option == 1) {
            if (agenda.getContatos() != null) {
                System.out.println(agenda.retornarContatos());
            } else {
                System.out.println("A agenda está vazia!");
            }
        } else if (option == 2) {
            String contatoEspecifico;

            System.out.println("Informe o nome do contato específico:");
            contatoEspecifico = scan.nextLine();

            System.out.println(agenda.retornarContato(contatoEspecifico));
        } else {
            System.out.println("Digite uma opção válida!");
        }
    }
}
