package com.Futurecollars.Lekcja2.Zadanie3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenTest {
    @Test
    void numberIsEven ()
    {
        //given
        int number=24;
        //when
        int value = Even.checkIfNumberIsOddOrEven(number);
        //then
        Assertions.assertEquals(0,value);

    }
    @Test
    void numberIsOdd ()
    {
        //given
        int number=25;
        //when
        int val = Even.checkIfNumberIsOddOrEven(number);
        //then
        Assertions.assertEquals(1,val);

    }

}
