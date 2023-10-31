package com.Futurecollars.Lekcja6.Zadanie3;

import java.io.IOException;

public class FileCharCount {
    public static void main(String[] args) throws IOException {
        File characters=  new File();
        characters.readLine("src/main/java/com/Futurecollars/Lekcja6/Zadanie4/data.txt");
        characters.getCharCount();
    }
}
