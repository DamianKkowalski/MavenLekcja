package com.Futurecollars.Lekcja12.Zadanie1;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.FileWriter;
import java.io.IOException;

public class SavePage {

    public static void saveWebpage(String url, String filename) {
        try {
            Document document = Jsoup.connect(url).get();

            document.select("img").remove();
            document.select("script").remove();

            try (FileWriter fileWriter = new FileWriter(filename)) {
                fileWriter.write(document.outerHtml());
            }

            System.out.println("Strona " + url + " została zapisana jako " + filename);
        } catch (IOException e) {
            System.err.println("Błąd podczas pobierania strony: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        String url = "https://futurecollars.com/en/";
        String filename = "example.html";

        saveWebpage(url, filename);
    }
}