package com.Futurecollars.Lekcja3.Zadanie4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.Futurecollars.Lekcja3.Zadanie4.ConversionMinutesToSeconds.conversion;

public class ConversionTest {


    @Test
    void CalculationMinusNumber() {
        //given
        int time = -60;
        //when
        int result = conversion(time);
        //then
        Assertions.assertEquals(result > 0, result < 0, "Time is negative");

    }

    @Test
    void CalculationPlusNumber() {
        //given
        int time = 60;
        //when
        int result = conversion(time);
        //then
        Assertions.assertEquals(3600, result, "Liczby nie sa rowne, blad");
    }
}
