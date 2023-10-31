package com.Futurecollars.Lekcja6.Zadanie4;

import java.io.IOException;
import java.util.Scanner;

public class findWord extends File{
    public findWord() {
    }
    String word;
    @Override
    public String getWord()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Podaj slowo do wyszukania ");
        word = sc.next();
        sc.close();
        return word;

    }
    @Override
    public  int matchWord() throws IOException {
        String buff;
        while ((buff = input.readLine()) != null) {
           if(buff.equals(word)) {
               Counter++;
           }

        }
        if(Counter>0) {
            System.out.println("liczba szukanych slow wynosi " + Counter + " i jest to slowo " + word);
        }
        else
        {
            System.out.println("Nie znaleizono szukanych slow");
        }
        return Counter;
    }

}
