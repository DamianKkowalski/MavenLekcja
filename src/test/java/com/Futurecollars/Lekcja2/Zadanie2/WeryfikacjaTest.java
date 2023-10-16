package com.Futurecollars.Lekcja2.Zadanie2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeryfikacjaTest
{
    @Test
    void AgeIsLower ()
    {
        //given
        int wiek=25;
        //when
        int age = Weryfikacja.age(wiek);
        //then
        Assertions.assertTrue(age>=18, "Wiek nie jest rowny lub wiekszy niz 18");

    }



}

