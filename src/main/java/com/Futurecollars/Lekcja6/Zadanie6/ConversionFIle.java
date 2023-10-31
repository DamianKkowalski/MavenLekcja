package com.Futurecollars.Lekcja6.Zadanie6;


public class ConversionFIle {
    public static void main(String[] args) {
        String NewText;
        File file = new File();
        NewText=file.readFile("src/main/java/com/Futurecollars/Lekcja6/Zadanie7/data.txt");
        file.writeToFile("src/main/java/com/Futurecollars/Lekcja6/Zadanie7/output.txt",NewText.toUpperCase());

    }
}
