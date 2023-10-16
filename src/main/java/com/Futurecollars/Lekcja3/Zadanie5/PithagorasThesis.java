package com.Futurecollars.Lekcja3.Zadanie5;

public class PithagorasThesis {
    public static int a;
    public static int b;
    public static int c;

    public static int calculation()
    {
        if (a*a+b*b==c*c)
        {
            System.out.println("Trojkat jest prostokatny");
        }
        else
        {
            System.out.println("Trojkat nie jest prostokatny");
        }
       return a;
    }
}
