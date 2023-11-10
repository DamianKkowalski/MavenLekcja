package com.Futurecollars.Lekcja11.Zadanie4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IgnorePrefix {
    public static void main(String[] args) {
        List<String> institutions = Arrays.asList(
                "Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra",
                "Przychodnia:Pediatra",
                "Przychodnia:Internista:Laryngolog:Pediatra"
        );

        List<String> uniqueSpecializations = institutions.stream()
                .flatMap(s -> Arrays.stream(s.split(":")))
                .filter(s -> !s.equals("Szpital") && !s.equals("Przychodnia"))
                .distinct()
                .collect(Collectors.toList());

        uniqueSpecializations.forEach(System.out::println);

    }
}
