package com.Futurecollars.Lekcja4.Zadanie4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LittleLettersTest {
    @Test
    void changeToLower() {
        LittleLetters ll = new LittleLetters();

        String text = "ABCDEFGHIJKL";
        String text1 = ll.formatText(text);

        Assertions.assertEquals("abcdefghijkl", text1, "Litery sie nie zmieniaja");

    }
}
