package com.Futurecollars.Lekcja5.Zadanie2;

public class FizzBuzz {
    public static void playFizzBuzz(int endValue) {
        for (int number = 1; number <= endValue; number++) {
            if (number % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else System.out.println(number);
        }
    }
    public static void main(String[] args) {
        int endValue = 100;
        playFizzBuzz(endValue);
    }
}
