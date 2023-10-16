package com.Futurecollars.Lekcja4.Zadanie9;

public class Triangle {
    double width;
    double height;
    public Triangle(double width, double height)
    {
        this.width=width;
        this.height=height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
