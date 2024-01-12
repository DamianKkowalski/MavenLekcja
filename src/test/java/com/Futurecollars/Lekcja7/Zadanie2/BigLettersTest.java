package com.Futurecollars.Lekcja7.Zadanie2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigLettersTest {
    @ParameterizedTest
    @ValueSource(strings = {"wolno", "uCzE", "SIE", "prOgamowAnia"})
    void shouldLettersChangeToUpperCase(String input) {
        String result = BigLetters.toUpperCase(input);
        assertEquals(input.toUpperCase(), result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "  ", "\t", "\n"})
    void emptyOrWhitespaceInputShouldReturnUnchangedString(String input) {
        assertEquals(input, BigLetters.toUpperCase(input));
    }

    @ParameterizedTest
    @CsvSource({"wolno, WOLNO", "uCzE, UCZE", "SIE, SIE","prOgramowania, PROGRAMOWANIA"})
    void specificCasesShouldReturnExpectedResult(String input, String expected) {
        assertEquals(expected, BigLetters.toUpperCase(input));
    }

    @ParameterizedTest
    @CsvSource({"123, 123", "!@#$%, !@#$%", "aBcD, ABCD"})
    void stringWithNumbersAndSpecialCharactersShouldReturnUnchangedString(String input, String expected) {
        assertEquals(expected, BigLetters.toUpperCase(input));
    }
}
