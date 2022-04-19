package com.rrvrafael.aulas.aula43.exercicios.ex03;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Animal[] animais = new Animal[3];
        Peixe peixe;
        Mamifero mamifero;

        int opcao;

        for (int i = 0; i < animais.length; i++) {
            System.out.println("Preencha as informações para os dados do Zoológico. Digite 1 p/ Peixe e 2 p/ Mamífero:");
            opcao = scan.nextInt();

            if (opcao == 1) {
                peixe = new Peixe();

                System.out.println("Informe os dados do peixe:\n");
                scan.nextLine();

                System.out.println("Digite o nome:");
                peixe.setNome(scan.nextLine());

                System.out.println("Digite o comprimento:");
                peixe.setComprimento(scan.nextDouble());

                System.out.println("Digite a velocidade:");
                peixe.setVelocidade(scan.nextDouble());

                animais[i] = peixe;
            } else if (opcao == 2) {
                mamifero = new Mamifero();

                System.out.println("Informe os dados do mamífero:\n");
                scan.nextLine();

                System.out.println("Digite o nome:");
                mamifero.setNome(scan.nextLine());

                System.out.println("Digite o comprimento:");
                mamifero.setComprimento(scan.nextDouble());

                /*System.out.println("Digite o nº de patas:");
                mamifero.setPatas(scan.nextInt());*/

                scan.nextLine();

                System.out.println("Digite a cor:");
                mamifero.setCor(scan.nextLine());

                System.out.println("Digite a velocidade:");
                mamifero.setVelocidade(scan.nextDouble());

                scan.nextLine();

                System.out.println("Digite o alimento:");
                mamifero.setAlimento(scan.nextLine());

                animais[i] = mamifero;
            } else {
                System.out.println("Opção inválida. Digite novamente!");
                i -= 1;
            }
        }

        System.out.println("\nZoo:");
        System.out.println("-------------------------");

        for (Animal animal : animais) {
            System.out.println(animal);
            System.out.println("-------------------------");
        }
    }
}
