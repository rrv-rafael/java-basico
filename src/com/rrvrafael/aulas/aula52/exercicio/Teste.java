package com.rrvrafael.aulas.aula52.exercicio;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();
        Contato contato;

        int opcao;

        do {
            System.out.println("********Sistema de Agenda********");
            System.out.println("1 - Consultar contato");
            System.out.println("2 - Adicionar contato");
            System.out.println("3 - Exibir todos os contatos");
            System.out.println("0 - Para sair");
            System.out.println("Informe a opção desejada:");

            try {
                opcao = scan.nextInt();

                if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("\nOpção inválida, digite novamente.\n");
                opcao = -1;
            }

            scan.nextLine();

            if (opcao == 1) {
                System.out.println("\nInforme o nome do contato:");
                String nome = scan.nextLine();

                try {
                    System.out.println(agenda.consultarContato(nome));
                } catch (ContatoNaoExisteException e) {
                    System.out.println(e.getMessage());
                }
            } else if (opcao == 2) {
                try {
                    agenda.verificarAgenda();
                } catch (AgendaCheiaException e) {
                    System.out.println(e.getMessage());
                    continue;
                }

                contato = new Contato();

                System.out.println("\nInforme o nome do contato:");
                contato.setNome(scan.nextLine());

                System.out.println("Informe o telefone do contato:");
                contato.setTelefone(scan.nextLine());

                agenda.inserirContato(contato);


            } else if (opcao == 3) {
                if (agenda.toString() != null) {
                    System.out.println(agenda);
                } else {
                    System.out.println("\nA agenda está vazia.\n");
                }
            }

        } while (opcao != 0);
    }
}
