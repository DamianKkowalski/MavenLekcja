package com.Futurecollars.Lekcja4.Zadanie4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigLettersTest {
    @Test
    void changeToUpper() {
        BigLetters bl = new BigLetters();

        String text = "abcdefghijkl";
        String text1 = bl.formatText(text);

        Assertions.assertEquals("ABCDEFGHIJKL", text1, "Litery sie nie zmieniaja");

    }
}
