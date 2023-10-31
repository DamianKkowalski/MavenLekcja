package com.Futurecollars.Lekcja6.Zadanie4;

import java.io.IOException;

public class findingWord {
    public static void main(String[] args) throws IOException {
        findWord find = new findWord();
        File loadfile = new File();
        loadfile.readLine("src/main/java/com/Futurecollars/Lekcja6/Zadanie5/data.txt");

        System.out.println(find.getWord());

        find.matchWord();
    }
}
