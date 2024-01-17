package com.Futurecollars.Lekcja7.Zadanie1;

public class MathUtils {

    public static boolean divideBy2(int number) {
        return number % 2 == 0;
    }

    public static int sum(int numbers) {
        int sumNumbers = 0;
        while (numbers > 0) {
            int digit;
            digit = numbers % 10;
            sumNumbers = sumNumbers + digit;
            numbers = numbers / 10;
        }
        return sumNumbers;
    }
}

