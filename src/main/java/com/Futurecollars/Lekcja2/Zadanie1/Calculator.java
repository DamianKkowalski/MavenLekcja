package com.Futurecollars.Lekcja2.Zadanie1;

public class Calculator {
    public void main(String[] args) {
        System.out.println(sum(2, 2));
        System.out.println(substraction(2, 2));
        System.out.println(multiplication(2, 2));
        System.out.println(derivative(2, 2));
    }

    public static int sum(int value1, int value2) {
        return value1 + value2;
    }

    public static int substraction(int value1, int value2) {
        return value1 - value2;
    }

    public static int multiplication(int value1, int value2) {
        return value1 * value2;
    }

    public static double derivative(double value1, double value2) {
        return value1 / value2;
    }


}
