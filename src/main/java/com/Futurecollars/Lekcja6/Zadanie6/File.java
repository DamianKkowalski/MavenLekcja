package com.Futurecollars.Lekcja6.Zadanie6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class File {
    String content;
    public String readFile(String pathToFile) {
        try {
            content = Files.readString(Paths.get(pathToFile));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return content;
    }

    public void writeToFile(String pathToFile, String text) {
        try {
            Files.writeString(Paths.get(pathToFile), text);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}