package com.Futurecollars.Lekcja4.Zadanie6;

public class Calculations {
    public static void main(String[] args) {
        BillCalculator bc = new BillCalculator();

        System.out.println("Podstawowa wartosc rachunku: "+bc.calculate(1000,50));
        System.out.println("Wartosc rachunku ze znizka: "+bc.calculate(1000,50,10));
        System.out.println("Wartosc rachunku z opakowaniami "+bc.calculate(900,15,20));
    }
}
