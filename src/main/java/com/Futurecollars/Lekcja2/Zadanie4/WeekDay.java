package com.Futurecollars.Lekcja2.Zadanie4;

public class WeekDay {

    public static String checkDayOfWeek(int dayNumber) {
        if (dayNumber >= 1 && dayNumber <= 5) {
            return checkWeekday(dayNumber);
        } else if (dayNumber >= 5 && dayNumber <= 7) {
            return "Weekend";
        } else {
            return "There is no such a day!";
        }
    }

    private static String checkWeekday(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            default:
                return "";
        }
    }

}
