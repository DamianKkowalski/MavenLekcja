package com.Futurecollars.Lekcja5.Zadanie3;

class Division implements Operation {
    @Override
    public double execute(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}