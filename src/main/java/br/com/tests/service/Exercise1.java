package br.com.tests.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        //Retorna todos os números naturais menores que 10
        List<Long> naturalNumbers = returnNaturalNumbersList(1000L);

        //Retorna os números múltiplos de 3 e 5
        List<Long> multiples1 = returnMultiplesBy3or5(naturalNumbers);
        List<Long> multiples2 = returnMultiplesBy3and5(naturalNumbers);
        List<Long> multiples3 = returnMultiplesBy3or5and7(naturalNumbers);

        //Somas
        Long sum1 = returnSum(multiples1);
        System.out.println("Soma de todos os números múltiplos de 3 ou 5 de números naturais abaixo de 1000: " + sum1);

        System.out.println("\n");

        Long sum2 = returnSum(multiples2);
        System.out.println("Soma de todos os números múltiplos de 3 e 5 de números naturais abaixo de 1000: " + sum2);

        System.out.println("\n");

        Long sum3 = returnSum(multiples3);
        System.out.println("Soma de todos os números múltiplos de (3 ou 5) e 7 de números naturais abaixo de 1000: " + sum3);
    }

    public static List<Long> returnNaturalNumbersList(Long maxValue) {
        List<Long> naturalNumbers = new ArrayList<>();

        for (int i = 0; i < maxValue; i++) {
            naturalNumbers.add((long) i);
        }
        return naturalNumbers;
    }

    public static List<Long> returnMultiplesBy3or5(List<Long> naturalNumbers) {
        List<Long> multiples = new ArrayList<Long>();

        naturalNumbers.forEach(i -> {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                multiples.add(i);
            }
        });

        return multiples;
    }

    public static List<Long> returnMultiplesBy3and5(List<Long> naturalNumbers) {
        List<Long> multiplos = new ArrayList<Long>();

        naturalNumbers.forEach(i -> {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                multiplos.add(i);
            }
        });

        return multiplos;
    }

    public static List<Long> returnMultiplesBy3or5and7(List<Long> naturalNumbers) {
        List<Long> multiplos = new ArrayList<Long>();

        naturalNumbers.forEach(i -> {
            if (((i % 3 == 0) || (i % 5 == 0)) && (i % 7 == 0)) {
                multiplos.add(i);
            }
        });

        return multiplos;
    }

    public static Long returnSum(List<Long> naturalNumbersList) {
        return naturalNumbersList.stream().collect(Collectors.summingLong(Long::longValue));
    }
}
