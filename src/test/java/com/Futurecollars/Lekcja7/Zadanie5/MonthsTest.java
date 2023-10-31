package com.Futurecollars.Lekcja7.Zadanie5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.Month;
import java.util.stream.Stream;

public class MonthsTest {
    @ParameterizedTest
    @MethodSource("provideStringsForMonthsAndSeasons")

    void shouldVerifyIfSeasonIsProper(Month month, Season season) {
        Months methodtest= new Months();
        Assertions.assertEquals(methodtest.convertMonthsToSeason(month), season);
    }
    private static Stream<Arguments> provideStringsForMonthsAndSeasons() {
        return Stream.of(
                Arguments.of("JANUARY", "WINTER"),
                Arguments.of("FEBRUARY", "WINTER"),
                Arguments.of("MARCH", "WINTER"),
                Arguments.of("APRIL", "SPRING"),
                Arguments.of("MAY", "SPRING"),
                Arguments.of("JUNE", "SPRING"),
                Arguments.of("JULY", "SUMMER"),
                Arguments.of("AUGUST", "SUMMER"),
                Arguments.of("SEPTEMBER", "SUMMER"),
                Arguments.of("OCTOBER", "AUTUMN"),
                Arguments.of("NOVEMBER", "AUTUMN"),
                Arguments.of("DECEMBER", "AUTUMN")
        );
}}
