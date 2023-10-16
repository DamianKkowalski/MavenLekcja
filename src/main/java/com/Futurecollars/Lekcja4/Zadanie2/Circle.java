package com.Futurecollars.Lekcja4.Zadanie2;

public class Circle extends Shape{
    double r;

    @Override
    public double getArea()
    {
        Area=Math.PI*r*r;
        return Area;
    }
    @Override
    public double getPerimeter()
    {
        Perimeter=Math.PI*r*2;
        return Perimeter;
    }
}
