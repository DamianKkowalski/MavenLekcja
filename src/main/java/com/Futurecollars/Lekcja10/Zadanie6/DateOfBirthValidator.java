package com.Futurecollars.Lekcja10.Zadanie6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateOfBirthValidator {
    public static void main(String[] args) {
        String birthdayDay = "1996-03-29";

    if (isDateValid(birthdayDay))
        {
            int[] dateComponents = extractionOfDateComponents(birthdayDay);
            int age = calculateAge(dateComponents[0],dateComponents[1],dateComponents[2]);
            DayOfWeek dayOfWeek = getDaOfWeek(dateComponents[0],dateComponents[1],dateComponents[2]);
            int weekOfYear = getWeekOfYear(dateComponents[0],dateComponents[1],dateComponents[2]);
            System.out.println("Age: " + age + " years old");
            System.out.println("Day of week of birth: " + dayOfWeek);
            System.out.println("Week number of the year: " + weekOfYear);
        } else {
        System.out.println("Nieprawidłowy format daty.");
    }
}
    public static boolean isDateValid(String dateOfBirth) {
        String dateOfBirthRegex = "\\d\\d\\d\\d-\\d\\d-\\d\\d";
        Pattern pattern = Pattern.compile(dateOfBirthRegex);
        Matcher matcher = pattern.matcher(dateOfBirth);
        return matcher.matches();
    }
    public static int[] extractionOfDateComponents(String dateOfBirth)
    {
        String[] components = dateOfBirth.split("-");
        int year = Integer.parseInt(components[0]);
        int month = Integer.parseInt(components[1]);
        int day = Integer.parseInt(components[2]);
        return new int[] {year,month,day};
    }
    public static int calculateAge(int year, int month, int day)
    {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthday = LocalDate.of(year,month,day);
        return currentDate.getYear() - birthday.getYear();
    }
    public static DayOfWeek getDaOfWeek(int year, int month, int day)
    {
        LocalDate birthday = LocalDate.of(year, month, day);
        return birthday.getDayOfWeek();
    }
    public static int getWeekOfYear(int year, int month, int day)
    {
        LocalDate birthday = LocalDate.of(year, month, day);
        return birthday.get(WeekFields.ISO.weekOfYear());
    }
}


