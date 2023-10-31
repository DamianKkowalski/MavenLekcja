package com.Futurecollars.Lekcja6.Zadanie7;

import static java.lang.Math.*;
public class Calculation {
    public static double element (double number1)
    {
        if(number1<0){
        throw new IllegalArgumentException("Nie mozesz obliczyc pierwiastka z liczy ujemnej");
        }
        return sqrt(number1);
    }

}
