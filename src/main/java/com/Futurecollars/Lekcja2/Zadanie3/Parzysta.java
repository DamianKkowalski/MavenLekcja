package com.Futurecollars.Lekcja2.Zadanie3;

class Parzysta{
    public static void main (String[] args)
    {
        System.out.println(liczba(3));


    }
    public static int liczba(int val)
    {
        int result = val % 2;
        if (result==0)
        {
            System.out.println("Liczba Parzysta");
        }

        if (result>0)
        {
            System.out.println("Liczba Nieparzysta");
        }

        return result;
    }
}