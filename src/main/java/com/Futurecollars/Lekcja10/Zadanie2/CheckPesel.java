package com.Futurecollars.Lekcja10.Zadanie2;

public class CheckPesel {
    public static void main(String[] args) {

        String pesel1 = "123123123k12";
        String pesel2 = "98767898717";
        System.out.println(PeselValidator.checkPesel(pesel1));
        System.out.println(PeselValidator.checkPesel(pesel2));

    }
}
