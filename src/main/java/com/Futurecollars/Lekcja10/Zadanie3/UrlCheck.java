package com.Futurecollars.Lekcja10.Zadanie3;

public class UrlCheck {
    public static void main(String[] args) {

        String exampleUrl1 = "http://www.onet.pl";
        String exampleUrl2 = "https://mail.google.com";
        String exampleUrl3 = "http://wiadmosci.onet.pl";
        String exampleUrl4 = "http://onet.pl";

        System.out.println(UrlValidator.validation(exampleUrl1));
        System.out.println(UrlValidator.validation(exampleUrl2));
        System.out.println(UrlValidator.validation(exampleUrl3));
        System.out.println(UrlValidator.validation(exampleUrl4));

    }
}
