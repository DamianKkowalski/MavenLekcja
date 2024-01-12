package com.Futurecollars.Lekcja7.Zadanie2;

public class BigLetters {

    public static String toUpperCase(String s) {
        if (s == null){
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (int x = 0; x < s.length(); x++) {
            char ch = s.charAt(x);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }

        System.out.println(result);
        return result.toString();
    }
}
