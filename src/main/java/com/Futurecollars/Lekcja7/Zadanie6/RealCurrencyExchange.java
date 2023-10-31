package com.Futurecollars.Lekcja7.Zadanie6;

public class RealCurrencyExchange implements CurrencyExchange{
    @Override
    public double getExchangeRate(Currency buyingCurrency, Currency sellingCurrency, boolean isBuyingRate) {
        if(isBuyingRate)
        {
            switch (buyingCurrency) {
                case PLN:
                    return 1.0;
                case EUR:
                    return 0.22;
                case GDP:
                    return 0.18;
                case USD:
                    return 0.21;
                default:
                    throw new IllegalArgumentException("Nieobslugiwana waluta" + buyingCurrency);
            }
            }
        else
            switch (sellingCurrency)
            {
                case PLN:
                    return 1.0;
                case EUR:
                    return 4.3;
                case GDP:
                    return 5.2;
                case USD:
                    return 4.2;
                default:
                    throw new IllegalArgumentException("Nieobslugiwana waluta" + sellingCurrency);
            }
        }

    }

