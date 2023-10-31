package com.Futurecollars.Lekcja6.Zadanie5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
    static BufferedReader input;
    String pathToFile;
    String line=null;
    String text;

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
    public String reverseWord()throws IOException
    {
        return text;
    }
}