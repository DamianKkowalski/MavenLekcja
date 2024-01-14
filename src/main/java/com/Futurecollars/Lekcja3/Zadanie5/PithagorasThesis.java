package com.Futurecollars.Lekcja3.Zadanie5;

public class PithagorasThesis {

    public static boolean isPithagorasTheoremFullfilled(double sideA, double sideB, double sideC) {


        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("Length of the sides should be positive");
        }
        return sideA * sideA + sideB * sideB == sideC * sideC;

    }
}
