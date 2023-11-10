package com.Futurecollars.Lekcja10.Zadanie4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractor {

    public static void main(String[] args) {
        String[] text = {"342",
                "5.34",
                "756",
                "1.234e+07",
                "7.234243E-02",
                "6.09",
                "3457",
                "87",
                "1.0001",
                "3",
                "5"};

        String integerRegex = "^-?\\d+$";
        String floatRegex = "\\b\\d+\\.\\d+\\b";
        String scientificNotationRegex = "\\b\\d+\\.\\d+[Ee][+-]?\\d+\\b";

        Pattern integerPattern = Pattern.compile(integerRegex);
        Pattern floatPattern = Pattern.compile(floatRegex);
        Pattern scientificNotationPattern = Pattern.compile(scientificNotationRegex);

        for (String tex:text) {
            Matcher integerMatcher = integerPattern.matcher(tex);
            while (integerMatcher.find()) {
                System.out.println("Integer numbers:" + integerMatcher.group());
            }
        }
        for (String tex:text) {
            Matcher floatMatcher = floatPattern.matcher(tex);
            while (floatMatcher.find()) {
                System.out.println("Float numbers:" + floatMatcher.group());
            }}
        for (String tex:text) {
            Matcher scientificNotationMatcher = scientificNotationPattern.matcher(tex);
            while (scientificNotationMatcher.find()) {
                System.out.println("Scientifix notation " + scientificNotationMatcher.group());
            }}


    }
}
