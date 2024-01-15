package com.Futurecollars.Lekcja2.Zadanie1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void shouldAddTwoValues1and1() {
        //given
        int value1 = 1;
        int value2 = 1;

        //when
        int sum = Calculator.sum(value1, value2);

        //then
        Assertions.assertEquals(2, sum);
    }

    @Test
    void shouldSubsTwoValues1and1() {
        int value1 = 1;
        int value2 = 1;

        //when
        int subs = Calculator.substraction(value1, value2);

        //then
        Assertions.assertEquals(0, subs);
    }

    @Test
    void shouldmultTwoValues3and4() {
        int value1 = 3;
        int value2 = 4;

        //when
        int mult = Calculator.multiplication(value1, value2);

        //then
        Assertions.assertEquals(12, mult);
    }

    @Test
    void shoulderiTwoValues4and0() {
        double value1 = 4;
        double value2 = 0;

        //when
        double deri = Calculator.derivative(value1, value2);

        //then
        Assertions.assertEquals(Double.POSITIVE_INFINITY, deri, "Nieskonczonosc");
    }

    @Test
    void shoulderiTwoValues18and3() {
        double value1 = 18;
        double value2 = 3;

        //when
        double deri = Calculator.derivative(value1, value2);

        //then
        Assertions.assertEquals(6, deri);
    }

}