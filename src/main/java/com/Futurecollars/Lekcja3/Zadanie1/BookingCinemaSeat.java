package com.Futurecollars.Lekcja3.Zadanie1;

public class BookingCinemaSeat {

    public static void main(String[] args) {
        Cinema cinemaSeat1 = new Cinema(4, 5);
        System.out.println(cinemaSeat1);
        cinemaSeat1.occupySeat();
        System.out.println(cinemaSeat1);
    }
}
