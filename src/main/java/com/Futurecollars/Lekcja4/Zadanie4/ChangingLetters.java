package com.Futurecollars.Lekcja4.Zadanie4;

public class ChangingLetters {
    public static void main(String[] args) {
        BigLetters bl= new BigLetters();
        LittleLetters ll = new LittleLetters();

        System.out.println(ll.formatText(bl.getText("KSJDkfnjsdkfsakjJKJKfj")));
        System.out.println(bl.formatText(bl.getText("KSJDkfnjsdkfsakjJKJKfj")));
    }

}
