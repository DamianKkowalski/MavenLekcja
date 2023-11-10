package com.Futurecollars.Lekcja11.Zadanie5;

import java.util.List;
import java.util.stream.Collectors;

public class UniqueLetters {
    public static void main(String[] args) {
        List<String> words = List.of("zupa", "dzień", "koleś", "kurs", "jotun", "metin");

        String uniqueList = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .filter(Character::isLetter)
                .map(Character::toUpperCase)
                .distinct()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println("Unique letters in given list of words: \n"+uniqueList);

    }
}
