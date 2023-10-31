package com.Futurecollars.Lekcja6.Zadanie0;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateData {

    public static void main(String[] args) {
        String text="Kurs\n" +
                    "Java\n" +
                    "Lekcja 6\n" +
                    "Pliki\n" +
                    "Wyjątki\n" +
                    "Pliki\n" +
                    "Koniec pliku";

        try {
            Files.writeString(Paths.get("src/main/java/com/Futurecollars/Lekcja6/Zadanie1/test.txt"), text);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
