package com.Futurecollars.Lekcja4.Zadanie6;

public class Calculations {
    public static void main(String[] args) {
        BillCalculator bc = new BillCalculator();

        System.out.println("Podstawowa wartosc rachunku: " + bc.calculateBasicBill(1000, 50));
        System.out.println("Wartosc rachunku ze znizka: " + bc.calculateBillWithPromo(1000, 50, 10));
        System.out.println("Wartosc rachunku z opakowaniami " + bc.calculateBillWithAdditionalPay(900, 15, (short) 20));
    }
}
