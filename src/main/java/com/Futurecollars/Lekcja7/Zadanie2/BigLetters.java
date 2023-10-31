package com.Futurecollars.Lekcja7.Zadanie2;

public class BigLetters {

    public static String toUpperCase(String s){
        String str = "";
        for(int x=0; x<s.length(); x++){
            char ch = s.charAt(x);
            if(ch >= 'a' && ch <= 'z')
                str += "" + (char)(ch - 32);
            else
                str += "" + ch;
        }
        System.out.println(str);
        return str;
    }
}
