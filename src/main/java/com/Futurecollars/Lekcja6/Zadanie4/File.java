package com.Futurecollars.Lekcja6.Zadanie4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
    static BufferedReader input;
    String pathToFile;
    String line=null;
    String word;
    int Counter=0;


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

    public String getWord()
    {
        return word;
    }

    public  int matchWord() throws IOException {
      return Counter;
    }


}
