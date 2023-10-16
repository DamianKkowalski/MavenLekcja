package com.Futurecollars.Lekcja4.Zadanie3;

public class Circle implements Area {

    private double r;
    public void setR( double r)
    {
        this.r=r;
    }
    public double getR(double r)
    {
        return r;
    }
    @Override
    public double getParimeter()
    {
    return Math.PI*2*r;
    }
    public double getArea()
    {
    return Math.PI*r*r;
    }

}
