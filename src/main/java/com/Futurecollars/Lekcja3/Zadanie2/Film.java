package com.Futurecollars.Lekcja3.Zadanie2;

public class Film {

    String title;
    String name;
    String surname;
    int time;
    int productionYear;

    public Film(String title, String name, String surname, int time, int productionYear) {
        this.title = title;
        this.name = name;
        this.surname = surname;
        this.time = time;
        this.productionYear = productionYear;
    }
    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTime() {
        return time;
    }

    public int getProductionYear() {
        return productionYear;
    }



}
