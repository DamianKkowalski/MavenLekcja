package com.Futurecollars.Lekcja3.Zadanie1;

public class  BookingCinemaSeat {

    public static void main(String[] args)
    {
        int r = 10;
        int seat = 12;
        int NotOccupied=0;
        int Occupied=1;

        Cinema cinema = new Cinema();
        cinema.row=r;
        cinema.seat=seat;
        String occupied=cinema.EmptyOrOccupied[Occupied];
        System.out.println("Miejsce "+cinema.seat+" w rzedzie "+cinema.row+" jest "+occupied+".");



    }
}
