package com.Futurecollars.Lekcja6.Zadanie2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {

    BufferedReader input;
    String pathToFile;
    int lineNum;
    String line=null;
    public String readOddLine(String pathToFile) {

        this.pathToFile=pathToFile;
        try {
            input = new BufferedReader(new FileReader(pathToFile));
            while((line= input.readLine()) !=null)
            {
                lineNum++;
                if (lineNum % 2 ==0)
                {
                    System.out.println(line);;
                }
            }
        }
            catch (IOException exception) {
                exception.printStackTrace();
            }
        return line;
    }


}
