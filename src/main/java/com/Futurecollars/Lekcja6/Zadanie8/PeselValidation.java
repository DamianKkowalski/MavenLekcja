package com.Futurecollars.Lekcja6.Zadanie8;

public class PeselValidation {

    public  String pesel(String numbers)
    {
        if (numbers.length()!=11)
        {
            throw new IllegalLengthException("Podany PESEL jest zbyt dlugi lub zbyt krótki");
        }
        try {
            double d = Double.parseDouble(numbers);
        } catch(NumberFormatException nfe)
        {
            throw new  WrongTypeOfDataException("Podany PESEL nie jest liczba");
        }

        return numbers;
    }
}
