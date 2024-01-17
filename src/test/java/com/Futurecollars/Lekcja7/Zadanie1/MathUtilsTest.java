package com.Futurecollars.Lekcja7.Zadanie1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class MathUtilsTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 3, 4, 512, 1444, -38})
    void shouldVerifyIsNumberDividedByTwo(int number) {
        Assertions.assertTrue(MathUtils.divideBy2(number));
    }

    @ParameterizedTest
    @CsvSource(value = {"324:9", "-324:-9", "420:6", "0:0"}, delimiter = ':')
    void shouldVerifyIsNumberSum(int input, int expected) {
        Assertions.assertEquals(expected, MathUtils.sum(input));
    }

}
