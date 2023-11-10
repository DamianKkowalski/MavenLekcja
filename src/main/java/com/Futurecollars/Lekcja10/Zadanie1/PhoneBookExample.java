package com.Futurecollars.Lekcja10.Zadanie1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PhoneBookExample {
    public static void main(String[] args) {
        PhoneBook bookEntry = new PhoneBook();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/Futurecollars/Lekcja10/Zadanie1/data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0] != null && data[1] != null) {
                    PhoneBookEntry entry = new PhoneBookEntry(data[0], data[1], data[2], data[3]);
                    bookEntry.addEntry(entry);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

      try {
            PhoneBookEntry searchResult = bookEntry.searchByName("Dominik Dominikowski");
            System.out.println("Znaleziono wpis:");
            System.out.println("Imię i Nazwisko: " + searchResult.name + " " + searchResult.surname);
            System.out.println("Numer telefonu: " + searchResult.phoneNumber);
            System.out.println("Adres: " + searchResult.address);
        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());

    }

    }}


