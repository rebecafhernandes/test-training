package br.com.tests.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise2 {
    public static void main(String[] args) {
        int it = 1;

        boolean isHappy = isHappyNumber(it);

        if (isHappy) {
            System.out.printf("Nice! It is a happy number.");
        } else {
            System.out.println("Oh man... It's not a happy number :(");
        }
    }

    public static boolean isHappyNumber(int it) {
        boolean alreadyTried = false;
        boolean isHappy = false;
        List<Integer> triedNumbers = new ArrayList<>();

        int sum = 0;

        while (it != 1 && !alreadyTried) {
            //Adiciona o número da iteração no array dos números que já foram pensados
            triedNumbers.add(it);

            sum = returnSumPowNumbers(it);
            System.out.println("Somas: " + sum);

            if (triedNumbers.contains(sum)) {
                alreadyTried = true;
            } else {
                it = sum;
            }
        }

        if (it == 1) isHappy = true;

        return isHappy;
    }

    public static Integer returnPowNumber(int number) {
        return (int) Math.pow(number, 2);
    }

    public static int returnSumPowNumbers(int number) {
        String textNumber = String.valueOf(number);
        IntStream test = textNumber.chars().map(Character::getNumericValue);

        //Elevar ao quadrado e adicionar a variável de soma
        double totalSum = test.mapToDouble(i -> returnPowNumber(i)).sum();

        return (int) totalSum;
    }



}
