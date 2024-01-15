package com.Futurecollars.Lekcja3.Zadanie2;

public class ScreeningFIlm {

    public static void main(String[] args) {
        Film film = new Film("Marynarze", "Damian", "Kowalski", 180, 1999);
        System.out.println("Tytył filmu: " + film.getTitle() + "\nAutor filmu: " + film.getName() + " "
                            + film.getSurname() + "\nCzas trwania: "
                            + film.getTime() + "\nRok produkcji: " + film.getProductionYear());
    }
}
