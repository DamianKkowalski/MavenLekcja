package com.Futurecollars.Lekcja6.Zadanie3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
    static BufferedReader input;
    String pathToFile;
    int lineNum;
    String line=null;
    public String readLine(String pathToFile) {

        this.pathToFile=pathToFile;
        try {
            input = new BufferedReader(new FileReader(pathToFile));
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
        return line;
    }

    public static int getCharCount() throws IOException {
        int charCount = 0;
        String buff;

        while ((buff = input.readLine()) != null) {
            charCount += buff.length();
        }
        System.out.println("liczba znakow wynosi"+charCount);
        return charCount;
    }


}
