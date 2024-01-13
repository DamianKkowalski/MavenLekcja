package com.Futurecollars.Lekcja5.Zadanie3;

public class Examples {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setOperation(new Addition());
        System.out.println("Addition: " + calculator.calculate(5, 3));

        calculator.setOperation(new Multiplication());
        System.out.println("Multiplication: " + calculator.calculate(4, 6));
    }
}
