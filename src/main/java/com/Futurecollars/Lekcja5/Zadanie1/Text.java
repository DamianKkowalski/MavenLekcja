package com.Futurecollars.Lekcja5.Zadanie1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Text {
    public static void main(String[] args) {
        String Text = "naaana";
        String regex = ".*[a-zA-Z].*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcherText = pattern.matcher(Text); //finding letters
        Boolean textMatches = matcherText.matches(); //return

        if (textMatches == true) {
            System.out.println("Tekst istnieje i ma dlugosc znakow " + Text.length());
        }


        //checking for palindrome

        String textToLowerCase = Text.toLowerCase();
        int length = Text.length();
        int forward = 0;
        int backward = length - 1;
        boolean Logic = true;

        while (backward > forward && Logic) {
            char forwardChar = textToLowerCase.charAt(forward++);
            char backwardChar = textToLowerCase.charAt(backward--);
            if (forwardChar != backwardChar) {
                Logic = false;
            }
        }
        if (Logic == true)
            System.out.println("To jest palindrom " + Text);

        else
            System.out.println("To nie jest palindrom " + Text);
    }



}
