package com.Futurecollars.Lekcja7.Zadanie6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CurrencyCalculatorTest {


    @Test
    void shouldCurrencyExchange(){
        //given
        double amount = 500;
        double rate= 5;
        RealCurrencyExchange currency = Mockito.mock(RealCurrencyExchange.class);
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(currency);
        Mockito.when(currency.getExchangeRate(Currency.USD,Currency.PLN,false)).thenReturn(500.0);
        //when
        double result = currencyCalculator.convert(amount,Currency.USD,Currency.PLN,false);
        //then
        Assertions.assertEquals(500.0,result);



    }
}
