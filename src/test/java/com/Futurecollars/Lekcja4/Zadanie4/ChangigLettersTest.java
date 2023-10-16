package com.Futurecollars.Lekcja4.Zadanie4;

import com.Futurecollars.Lekcja4.Zadanie4.BigLetters;
import com.Futurecollars.Lekcja4.Zadanie4.LittleLetters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChangigLettersTest {

    @Test
    void ChangeToLower()
    {
        LittleLetters ll = new LittleLetters();

        String text="ABCDEFGHIJKL";
        String text1=ll.formatText(ll.getText(text));

        Assertions.assertEquals("abcdefghijkl",text1,"Litery sie nie zmieniaja");

    }

    @Test
    void ChangeToUpper()
    {
        BigLetters bl = new BigLetters();

        String text="abcdefghijkl";
        String text1=bl.formatText(bl.getText(text));

        Assertions.assertEquals("ABCDEFGHIJKL",text1,"Litery sie nie zmieniaja");

    }

}
