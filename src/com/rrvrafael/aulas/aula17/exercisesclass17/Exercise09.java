package com.rrvrafael.aulas.aula17.exercisesclass17;

public class Exercise09 {

    public static void main(String[] args) {

        System.out.println("Números ímpares de 1 à 50:");

        for (int i = 1; i <= 50; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }
}