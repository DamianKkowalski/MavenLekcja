package com.Futurecollars.Lekcja2.Zadanie4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeekDayTest {
    @Test
    void checkDayOfWeekTest() {
        assertEquals("Monday", WeekDay.checkDayOfWeek(1));
        assertEquals("Tuesday", WeekDay.checkDayOfWeek(2));
        assertEquals("Wednesday", WeekDay.checkDayOfWeek(3));
        assertEquals("Thursday", WeekDay.checkDayOfWeek(4));
        assertEquals("Friday", WeekDay.checkDayOfWeek(5));
    }
    @Test
    void checkDayOfWeekendTest() {
        assertEquals("Weekend", WeekDay.checkDayOfWeek(6));
        assertEquals("Weekend", WeekDay.checkDayOfWeek(7));
    }
    @Test
    void checkForInvalidNumbers() {
        assertEquals("There is no such a day!", WeekDay.checkDayOfWeek(8));
        assertEquals("There is no such a day!", WeekDay.checkDayOfWeek(-1));
    }
}
