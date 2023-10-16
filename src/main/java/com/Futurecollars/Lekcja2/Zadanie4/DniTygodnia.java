package com.Futurecollars.Lekcja2.Zadanie4;
import java.util.Scanner;
public class DniTygodnia {

    public static void main (String[] args)
    {   int dayw;
        Scanner sc=new Scanner(System.in);
        System.out.print("Podaj liczbe od 1 do 7: ");
        dayw = sc.nextInt();
        sc.close();

        WeekDay(dayw);
    }


    public static int WeekDay(int day)
    {
        if(day>=1 && day<=5)
        {
            System.out.println("Monday");
        }
        else if(day>=5 && day<=7)
        {
            System.out.println("Weekend");
        }
        else if(day>7)
        {
            System.out.println("There is no such a day");
        }
        return day;

    }

}
