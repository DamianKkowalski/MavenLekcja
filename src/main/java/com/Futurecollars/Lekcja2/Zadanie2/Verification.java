package com.Futurecollars.Lekcja2.Zadanie2;

//import java.util.Scanner;
class Verification {

    public static boolean isAdult(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age can't be negative");
        }
        return age >= 18;

    }

}



