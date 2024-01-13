package com.Futurecollars.Lekcja5.Zadanie3;

class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double a, double b) {
        if (operation == null) {
            throw new IllegalStateException("Operation is not set.");
        }
        return operation.execute(a, b);
    }
}
