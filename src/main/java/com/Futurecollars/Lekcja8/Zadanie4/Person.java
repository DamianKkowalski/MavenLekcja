package com.Futurecollars.Lekcja8.Zadanie4;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int birthYear;
    private final double height;
    private final double weight;

    public Person(String firstName, String lastName, int birthYear, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
