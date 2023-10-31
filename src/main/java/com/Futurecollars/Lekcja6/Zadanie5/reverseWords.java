package com.Futurecollars.Lekcja6.Zadanie5;

import java.io.IOException;

public class reverseWords extends File{
    public reverseWords() {
    }

    @Override
    public String reverseWord() throws IOException {
        String buff;
        char character;
        String lineReverse;
        while ((buff = input.readLine()) != null) {
            lineReverse="";
        for (int counter=0; counter<buff.length(); counter++)
        {
            character=buff.charAt(counter);
            lineReverse= character+lineReverse;
        }
            System.out.println(lineReverse);

        }
        return buff;
    }
}
