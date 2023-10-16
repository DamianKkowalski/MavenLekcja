package com.Futurecollars.Lekcja4.Zadanie2;
import static java.lang.Math.*;

public class Triangle extends Shape{

    double a;
    double b;
    double c;
    double h;
    double z;


    @Override
    public double getArea()
    {   h=(a+b+c)/2;
        z=h*((h-a)*(h-b)*(h-c));
        Area=sqrt(z);
        return Area;
    }
    @Override
    public double getPerimeter()
    {
        Perimeter=a+b+c;
        return Perimeter;
    }
}
