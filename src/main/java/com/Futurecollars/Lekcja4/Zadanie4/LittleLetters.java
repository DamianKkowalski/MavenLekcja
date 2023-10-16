package com.Futurecollars.Lekcja4.Zadanie4;

public class LittleLetters implements TextFormatter
{
    String text;

    public String getText(String text)
    {
        this.text=text;
        return text;
    }


    @Override
    public String formatText(String text)
    {
        return text.toLowerCase();
    }



}
