package com.Futurecollars.Lekcja6.Zadanie5;


import java.io.IOException;

public class FinalReverseFile {

        public static void main(String[] args) throws IOException {
            reverseWords reverse = new reverseWords();
            File loadfile = new File();
            loadfile.readLine("src/main/java/com/Futurecollars/Lekcja6/Zadanie6/data.txt");
            reverse.reverseWord();
        }
    }

