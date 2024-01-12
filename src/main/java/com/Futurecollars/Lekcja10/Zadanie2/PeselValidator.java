package com.Futurecollars.Lekcja10.Zadanie2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {


    public static boolean checkPesel(String pesel)
    {
        if (pesel == null) {
            return false;
        }
        String peselRegex = "\\d{11}";
        Pattern pattern = Pattern.compile(peselRegex);
        Matcher matcher = pattern.matcher(pesel);
        return matcher.matches();
    }

}
