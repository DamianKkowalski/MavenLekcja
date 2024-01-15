package com.Futurecollars.Lekcja2.Zadanie3;

class Even {
    public static int checkIfNumberIsOddOrEven(int val)
    {
        int result = val % 2;
        if (result==0)
        {
            System.out.println("Number is even");
        }

        if (result>0)
        {
            System.out.println("Number is odd");
        }

        return result;
    }
}