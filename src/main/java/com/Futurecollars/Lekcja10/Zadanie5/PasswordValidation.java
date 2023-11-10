package com.Futurecollars.Lekcja10.Zadanie5;

import java.time.Year;

public class PasswordValidation {
    public static boolean validatePassword(String password) {
        // Wymagania dotyczące hasła
        String uppercaseRegex = ".*[A-Z].*";
        String digitRegex = ".*\\d.*";
        String lengthRegex = ".{7,}";

        // Sprawdzenie, czy hasło spełnia wszystkie kryteria
        if (password.matches(uppercaseRegex) &&
                password.matches(digitRegex) &&
                password.matches(lengthRegex) &&
                !containsCurrentYear(password)) {
            return true;
        }
        return false;
    }

    private static boolean containsCurrentYear(String password) {
        String currentYear = String.valueOf(Year.now().getValue());
        return password.contains(currentYear) || password.contains(currentYear.substring(2));
    }

    public static void main(String[] args) {
        // Przykłady użycia
        String validPassword = "Go0dPa$$w0rd";
        String invalidPassword1 = "w3akpassword";
        String invalidPassword2 = "PasswrodWithYear2223";

        System.out.println(validatePassword(validPassword));      // true
        System.out.println(validatePassword(invalidPassword1));    // false
        System.out.println(validatePassword(invalidPassword2));    // false
    }
}
