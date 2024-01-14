package com.Futurecollars.Lekcja4.Zadanie4;

import java.util.Objects;

public class LittleLetters implements TextFormatter {
    @Override
    public String formatText(String text) {
        Objects.requireNonNull(text, "Input text cannot be null");
        return text.toLowerCase();
    }


}
