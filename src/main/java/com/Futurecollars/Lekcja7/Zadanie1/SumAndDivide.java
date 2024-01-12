package com.Futurecollars.Lekcja7.Zadanie1;

public class SumAndDivide {

    int digit;
    int sumNumbers;

    public boolean divideBy2(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public int sum(int numbers) {
        while (numbers > 0) {
            digit = numbers % 10;
            sumNumbers = sumNumbers + digit;
            numbers = numbers / 10;
        }
        return sumNumbers;
    }
}

