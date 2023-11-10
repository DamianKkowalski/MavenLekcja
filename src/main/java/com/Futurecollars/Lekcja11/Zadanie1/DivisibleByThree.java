package com.Futurecollars.Lekcja11.Zadanie1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivisibleByThree {
    public static void main(String[] args) {
        List<Integer> divisibleByThree = IntStream.rangeClosed(1, 20)
                .filter(number -> number % 3 == 0)
                .boxed()
                .collect(Collectors.toList());


        divisibleByThree.forEach(System.out::println);
    }}