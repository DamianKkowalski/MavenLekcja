package com.Futurecollars.Lekcja4.Zadanie2;

public class RectangleAndSquare extends Shape {

    double a;
    double b;

    @Override
    public double getArea() {
        Area = a * b;
        return Area;
    }

    @Override
    public double getPerimeter() {
        Perimeter = 2 * a + 2 * b;
        return Perimeter;
    }
}
