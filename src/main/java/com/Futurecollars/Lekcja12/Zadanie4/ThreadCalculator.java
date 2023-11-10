package com.Futurecollars.Lekcja12.Zadanie4;

import java.util.Arrays;

public class ThreadCalculator {
    public static void main(String[] args) {
        int[] numbers = {3, 55, 66, 764, -23, 545, 547, 238, 932, 110};

        Thread sumThread = new Thread(() -> {
            int sum = Arrays.stream(numbers).sum();
            System.out.println("Sum of all numbers: " + sum);
        });

        Thread averageThread = new Thread(() -> {
            double average = Arrays.stream(numbers).average().orElse(0.0);
            System.out.println("Average of the given numbers: " + average);
        });

        sumThread.start();
        averageThread.start();

        try {
            sumThread.join();
            averageThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
