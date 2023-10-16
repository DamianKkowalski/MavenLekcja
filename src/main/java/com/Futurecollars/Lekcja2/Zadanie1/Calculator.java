package com.Futurecollars.Lekcja2.Zadanie1;

public class Calculator{
    public void main (String[] args)
    {
        System.out.println(sum(2,2));
        System.out.println(subs(2,2));
        System.out.println(mult(2,2));
        System.out.println(deri(2,2));
    }

    public static int sum(int val, int val2)	{
        int result = val +val2;
        return result;
    }
    public static int subs (int sub, int sub2)	{
        int result2 = sub - sub2;
        return result2;
    }
    public static int mult (int mul, int mul2)	{
        int result3 = mul * mul2;
        return result3;
    }
    public static double deri(double der, double der2)	{
        double result4 = der / der2;
        return result4;
    }


}
