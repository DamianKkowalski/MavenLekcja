package com.Futurecollars.Lekcja3.Zadanie2;

public class ScreeningFIlm {

    public static void main(String[] args) {
        String title="Marynarze";
        String name="Damian";
        String surname="Kowalski";
        int time=180;
        int productionYear=1999;
        Film film=new Film();
        film.title=title;
        film.name=name;
        film.surname=surname;
        film.time=time;
        film.productionYear=productionYear;
        System.out.println("Tytył filmu: "+film.title+"\nAutor filmu: "+film.name+ " " +film.surname+"\nCzas trwania: "+film.time+"\nRok produkcji: "+film.productionYear );


    }
}
