package com.Futurecollars.Lekcja7.Zadanie4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.annotations.Test;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNull;

public class TextLengthTest {
    @ParameterizedTest
    @MethodSource("provideStringsAndNumbersForConversion")
    void shouldVerifyNumbersOfLetters(String input, int expected) {

        int actualValue = input.length();
        Assertions.assertEquals(expected, actualValue);
    }
    private static Stream<Arguments> provideStringsAndNumbersForConversion() {
        return Stream.of(
                Arguments.of("TEST", "4"),
                Arguments.of("Kajak", "5"),
                Arguments.of("LISTONOSZ", "9"),
                Arguments.of("", "0"),
                Arguments.of("           ", "11")
        );
    }
    @Test
    void countLettersShouldReturnNullForNullString() {

        TextLength textLength = new TextLength();
        Integer result = textLength.countLetters(null);
        assertNull(result);
    }
}
