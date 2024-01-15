package com.Futurecollars.Lekcja2.Zadanie2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VerificationTest {
    @Test
    void ageIsLower() {
        //given
        int age = 17;
        //when
        Boolean result = Verification.isAdult(age);
        //then
        Assertions.assertFalse(result, "Age isn't higher or exact 18");
    }

    @Test
    void ageIsHigherOrExact() {
        //given
        int age = 25;
        //when
        Boolean result = Verification.isAdult(age);
        //then
        Assertions.assertTrue(result, "Age isn't higher or exact 18");
    }

    @Test
    void ageIsNegative() {
        //given
        int age = -25;
        //when
        Boolean result = Verification.isAdult(age);
        //then
        Assertions.assertTrue(result, "Age isn't higher or exact 18");
    }

}

