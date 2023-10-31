package com.Futurecollars.Lekcja7.Zadanie2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class BigLettersTest {
@ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"wolno","uCzE", "SIE", "prOgamowAnia",})
    void shouldLettersChangeToUpperCase(String input)
{
    String actualValue = input.trim().toUpperCase();
    Assertions.assertEquals(BigLetters.toUpperCase(input),actualValue);
}
}
