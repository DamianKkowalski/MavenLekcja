package com.Futurecollars.Lekcja3.Zadanie4;


public class ConversionMinutesToSeconds {

    public static int conversion(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException("Time can't be negative.");
        }
        return minutes * 60;
    }


}
