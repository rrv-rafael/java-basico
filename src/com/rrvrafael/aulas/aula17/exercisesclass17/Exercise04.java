package com.rrvrafael.aulas.aula17.exercisesclass17;

public class Exercise04 {

    public static void main(String[] args) {

        int populacaoA = 80000, populacaoB = 200000, countAnos = 0;


        while (populacaoA <= populacaoB)
        {
            populacaoA += (populacaoA / 100) * 3;
            populacaoB += (populacaoB / 100) * 1.5;
            countAnos++;
        }

        System.out.println("População A: " + populacaoA);
        System.out.println("População B: " + populacaoB);
        System.out.println("Serão necessários " + countAnos + " anos para a população do país A passar a de B!");
    }
}