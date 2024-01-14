package com.Futurecollars.Lekcja10.Zadanie1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PhoneBookExample {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/Futurecollars/Lekcja10/Zadanie1/data.txt";
        PhoneBook bookEntry = new PhoneBook();
        loadPhoneBook(bookEntry, filePath);
      try {
            PhoneBookEntry searchResult = bookEntry.searchByName("Dominik Dominikowski");
            System.out.println("Znaleziono wpis:");
            System.out.println("Imię i Nazwisko: " + searchResult.name + " " + searchResult.surname);
            System.out.println("Numer telefonu: " + searchResult.phoneNumber);
            System.out.println("Adres: " + searchResult.address);
        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());

    }

    }
    private static void loadPhoneBook(PhoneBook phoneBook, String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 4 && data[0] != null && data[1] != null && data[2] != null ) {
                    PhoneBookEntry entry = new PhoneBookEntry(data[0], data[1], data[2], data[3]);
                    phoneBook.addEntry(entry);
                } else {
                    System.out.println("Skipping invalid entry: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}



