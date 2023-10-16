package com.Futurecollars.Lekcja2.Zadanie4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DniTygodniaTest
{
@Test
void LiczbaJestParzysta ()
{
    //given
    int liczba=-1;
    //when
    int val = DniTygodnia.WeekDay(liczba);
    //then
    Assertions.assertTrue(val>0,"Liczba jest mniejsza niz 1");

}

}
