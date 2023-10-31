package com.Futurecollars.Lekcja6.Zadanie1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Read {

    String pathToFile;
    String text;
    public String readFile(String pathToFile) {

        this.pathToFile=pathToFile;
        try {
            text = Files.readString(Path.of(pathToFile));
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println(text);
       return text;
    }


}
