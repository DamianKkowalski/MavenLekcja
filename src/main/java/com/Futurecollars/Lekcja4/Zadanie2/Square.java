package com.Futurecollars.Lekcja4.Zadanie2;

public class Square extends Shape {



    double a;
    @Override
    public double getArea()
    {
    Area=a*a;
    return Area;
    }
    @Override
    public double getPerimeter()
    {
        Perimeter=4*a;
        return Perimeter;
    }

}
