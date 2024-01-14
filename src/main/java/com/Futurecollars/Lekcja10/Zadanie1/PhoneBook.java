package com.Futurecollars.Lekcja10.Zadanie1;

import java.util.ArrayList;
import java.util.List;


    public class PhoneBook {
        public List<PhoneBookEntry> entries;

        public PhoneBook() {
            this.entries = new ArrayList<>();
        }

        public void addEntry(PhoneBookEntry entry) {
            entries.add(entry);

        }

        public PhoneBookEntry searchByName(String searchName) throws Exception {
            for (PhoneBookEntry entry : entries) {
                String fullName = entry.name + " " + entry.surname;
                if (searchName.equalsIgnoreCase(fullName))
                    return entry;
            }
            throw new Exception("User not found");
        }
    }
