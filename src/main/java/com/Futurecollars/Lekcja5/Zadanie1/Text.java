package com.Futurecollars.Lekcja5.Zadanie1;

public class Text {
    public static boolean isEmpty(String text) {
        return text.matches(".*[a-zA-Z].*");
    }

    public static int countCharacters(String text) {
        return text.length();
    }

    public static boolean isPalindrome(String text) {
        String cleanText = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        StringBuilder reversedText = new StringBuilder(cleanText).reverse();
        return cleanText.equals(reversedText.toString());
    }

    public static void main(String[] args) {
        String text = "kajak";
        if (isEmpty(text)) {
            System.out.println("The text contains characters");

            if (isPalindrome(text)) {
                System.out.println("The text is a palindrome");
            } else {
                System.out.println("The text is not a palindrome");
            }
            int textLength = countCharacters(text);
            System.out.println("The length of the text is: " + textLength);
        } else {
            System.out.println("The text is empty");
        }
    }

}
