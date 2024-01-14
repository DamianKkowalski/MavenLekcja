package com.Futurecollars.Lekcja4.Zadanie3;

public class Circle implements GeometricFigure {

    private double r;

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getParimeter() {
        return Math.PI * 2 * r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

}
