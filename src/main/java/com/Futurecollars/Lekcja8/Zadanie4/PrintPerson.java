package com.Futurecollars.Lekcja8.Zadanie4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class PrintPerson {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Kowalski", 1990, 175, 70));
        people.add(new Person("Anna", "Nowak", 1985, 160, 65));
        people.add(new Person("Adam", "Wiśniewski", 1970, 180, 80));

        // Sortowanie od najniższej do najwyższej
        System.out.println("Sortowanie od najniższej do najwyższej:");
        Collections.sort(people, Comparator.comparingDouble(Person::getHeight));
        displayPeople(people);


        // Sortowanie od najcięższej do najlżejszej
        System.out.println("\nSortowanie od najcięższej do najlżejszej:");
        Collections.sort(people, Comparator.comparingDouble(Person::getWeight).reversed());
        displayPeople(people);

        // Domyślne sortowanie od najmłodszej do najstarszej
        System.out.println("\nDomyślne sortowanie od najmłodszej do najstarszej:");
        Collections.sort(people);
        displayPeople(people);
    }

    private static void displayPeople(List<Person> people) {
        for (Person person : people) {
            System.out.println("Imie " +person.getFirstName() + " Nazwisko "+ person.getLastName()
                    + " Rok urodzenia: "+ person.getBirthYear()
                    + " Wzrost: "+ person.getHeight()
                    + " Waga: "+ person.getWeight());
        }
    }
}