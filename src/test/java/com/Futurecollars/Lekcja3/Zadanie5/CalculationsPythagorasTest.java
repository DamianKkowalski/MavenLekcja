package com.Futurecollars.Lekcja3.Zadanie5;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculationsPythagorasTest {

    @Test
    void CalculationMinusNumber() {
        PithagorasThesis pithagoras = new PithagorasThesis();
        //given
        int a = -3;
        int b = -4;
        int c = -5;
        //when
        pithagoras.a = a;
        pithagoras.b = b;
        pithagoras.c = c;
        //then
        Assertions.assertEquals(pithagoras.a * pithagoras.a + pithagoras.b * pithagoras.b, pithagoras.c * pithagoras.c);

    }

    @Test
    void CalculationPlusNumber()
    {
    PithagorasThesis pithagoras = new PithagorasThesis();
    //given
    int a = 3;
    int b = 4;
    int c = 5;
    //when
    pithagoras.a =a;
    pithagoras.b =b;
    pithagoras.c =c;
    //then
        Assertions.assertEquals(pithagoras.a*pithagoras.a+pithagoras.b*pithagoras.b,pithagoras.c*pithagoras.c);
    }
    @Test
    void CalculationPlusNumberDiff()
    {
        PithagorasThesis pithagoras = new PithagorasThesis();
        //given
        int a = 4;
        int b = 4;
        int c = 5;
        //when
        pithagoras.a =a;
        pithagoras.b =b;
        pithagoras.c =c;
        //then
        Assertions.assertEquals(pithagoras.a*pithagoras.a+pithagoras.b*pithagoras.b,pithagoras.c*pithagoras.c);
    }
    @Test
    void CalculationZeroNumbera()
    {
        PithagorasThesis pithagoras = new PithagorasThesis();
        //given
        int a = 0;
        int b = 4;
        int c = 5;
        //when
        pithagoras.a =a;
        pithagoras.b =b;
        pithagoras.c =c;
        //then
        Assertions.assertFalse(pithagoras.a==0,"To nie jest trojkat"); ;
    }
    @Test
    void CalculationZeroNumberb()
    {
        PithagorasThesis pithagoras = new PithagorasThesis();
        //given
        int a = 1;
        int b = 0;
        int c = 5;
        //when
        pithagoras.a =a;
        pithagoras.b =b;
        pithagoras.c =c;
        //then
        Assertions.assertFalse(pithagoras.b==0,"To nie jest trojkat"); ;
    }
    @Test
    void CalculationZeroNumberc()
    {
        PithagorasThesis pithagoras = new PithagorasThesis();
        //given
        int a = 1;
        int b = 4;
        int c = 0;
        //when
        pithagoras.a =a;
        pithagoras.b =b;
        pithagoras.c =c;
        //then
        Assertions.assertFalse(pithagoras.c==0,"To nie jest trojkat"); ;
    }

}
