package com.Futurecollars.Lekcja7.Zadanie5;
import java.time.Month;

public class Months {


public Season convertMonthsToSeason(Month month){
 switch (month)
    {
        case APRIL:
        case MAY:
        case JUNE:
            return Season.SPRING;

        case JULY:
        case AUGUST:
        case SEPTEMBER:
            return Season.SUMMER;

        case OCTOBER:
        case NOVEMBER:
        case DECEMBER:
            return Season.AUTUMN;

        case JANUARY:
        case FEBRUARY:
        case MARCH:
            return Season.WINTER;
    }

    return null;
}
}