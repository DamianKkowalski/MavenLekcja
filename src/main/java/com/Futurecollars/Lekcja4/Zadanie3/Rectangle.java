package com.Futurecollars.Lekcja4.Zadanie3;

public class Rectangle implements Area{

    private double a;
    private double b;
    public void setA( double a)
    {
        this.a=a;
    }
    public double getA(double a)
    {
        return a;
    }
    public void setB( double b)
    {
        this.b=b;
    }
    public double getB(double b)
    {
        return b;
    }



    @Override
    public double getParimeter()
    {
        return 2*a+2*b;
    }
    public double getArea()
    {
        return a*b;
    }

}
