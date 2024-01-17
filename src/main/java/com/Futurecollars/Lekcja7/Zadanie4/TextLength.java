package com.Futurecollars.Lekcja7.Zadanie4;

public class TextLength {
    public Integer countLetters(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Text cant be empty");
        }
        return text.length();
    }
}
