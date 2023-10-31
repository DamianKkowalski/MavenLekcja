package com.Futurecollars.Lekcja7.Zadanie4;

public class TextLength {
    public int countLetters (String text)
    {
        int i = 0;

        for (char character : text.toCharArray())
        {
            i++;
        }
        System.out.println(i);
        return i;

    }
}
