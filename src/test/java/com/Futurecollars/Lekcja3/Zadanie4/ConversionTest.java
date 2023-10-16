package com.Futurecollars.Lekcja3.Zadanie4;

import com.Futurecollars.Lekcja3.Zadanie4.Conversion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConversionTest {



    @Test
    void CalculationMinusNumber ()
    {   Conversion conversion=new Conversion();
        //given
        int liczba=-60;
        //when
        conversion.minutes = liczba;
        //then
        Assertions.assertFalse(Conversion.conversion()<0,"Czas jest ujemny");

    }
    @Test
    void CalculationPlusNumber()
    {
        Conversion conversion=new Conversion();
        //given
        int liczba=60;
        //when
        conversion.minutes = liczba;
        //then
        Assertions.assertEquals(3600,Conversion.conversion(),"Liczby nie sa rowne, blad");
    }
}
