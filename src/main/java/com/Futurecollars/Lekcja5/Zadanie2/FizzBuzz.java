package com.Futurecollars.Lekcja5.Zadanie2;

public class FizzBuzz {
    public static void main(String[] args) {


    int Number;

    for(Number=1; Number<=100; Number++)
    {
        if (Number % 15==0)
        {
            System.out.println("FizzBuzz");
        }
        if (Number % 3==0)
        {
            System.out.println("Fizz");
        }
        else if (Number % 5==0)
        {
            System.out.println("Buzz");
        }
        else
        System.out.println(Number);
    }
}
}
