package com.Futurecollars.Lekcja6.Zadanie9;

public class Validation {

    public void validate(int[] values)
    {
        for (int value : values) {
            try {
                if (value % 3 == 0) {
                    System.out.println("Liczba " + value + " jest podzielna przez 3");
                }
                else
                {
                    throw new IllegalArgumentException("Liczba "+ value + " nie jest podzielna przez 3");
                }
            } catch (IllegalArgumentException e) {

                    System.out.println(e);
            }
        }
}}
