package com.Futurecollars.Lekcja2.Zadanie3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParzystaTest {
    @Test
    void LiczbaJestParzysta ()
    {
        //given
        int liczba=24;
        //when
        int val = Parzysta.liczba(liczba);
        //then
        Assertions.assertEquals(0,val);

    }
    @Test
    void LiczbaNieJestParzysta ()
    {
        //given
        int liczba=25;
        //when
        int val = Parzysta.liczba(liczba);
        //then
        Assertions.assertEquals(1,val);

    }

}
