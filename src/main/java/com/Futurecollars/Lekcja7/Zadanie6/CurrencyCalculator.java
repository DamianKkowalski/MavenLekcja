package com.Futurecollars.Lekcja7.Zadanie6;

public class CurrencyCalculator extends RealCurrencyExchange {


    public CurrencyCalculator(RealCurrencyExchange currency) {
        super();
    }

    public double convert(double amount, Currency from, Currency to, boolean isBuyingRate)
    {
        double exchangeRate=getExchangeRate(from, to, isBuyingRate);
        return amount*exchangeRate;
    }
}
