package com.rrvrafael.aulas.aula18;

import java.util.Scanner;

public class BreakAndContinue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*int num, max;

        System.out.println("Digite um número:");
        num = scan.nextInt();

        System.out.println("Digite um limite:");
        max = scan.nextInt();

        for (int i = num; i <= max; i++)
        {
            if (i % 7 == 0)
            {
                System.out.println("O primeiro número divisivel por 7 dentro desse limite é: " + i);
                break;
            }
        }

        for (int i = 0; i <= 4; i++)
        {
            rotulo1:
            {
                rotulo2:
                {
                    rotulo3:
                    {
                        if (i == 1)
                        {
                            break rotulo1;
                        }
                        if (i == 2)
                        {
                            break rotulo2;
                        }
                        if (i == 3)
                        {
                            break rotulo3;
                        }

                        System.out.println("rótulo 3");
                    }

                    System.out.println("rótulo 2");
                }

                System.out.println("rótulo 1");
            }

            System.out.println(i);
        }*/

        int num, max;

        System.out.println("Digite um número:");
        num = scan.nextInt();

        System.out.println("Digite um limite:");
        max = scan.nextInt();

        for (int i = num; i <= max; i++)
        {
            if (i % 7 == 0)
            {
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }
    }
}