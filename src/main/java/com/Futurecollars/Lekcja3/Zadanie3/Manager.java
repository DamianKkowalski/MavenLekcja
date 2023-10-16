package com.Futurecollars.Lekcja3.Zadanie3;

import java.util.Scanner;

class Manager extends BaseEmployee{

     int bonus;
     int i=2023-YoEmployment;
     int s;

    public Manager(String name, String surname, int salary, int YoEmployment, int bonus)
    {
        super(name, surname, salary, YoEmployment);
        this.bonus=bonus;


    }
     @Override
     public String SalaryPrint()
    {
        return "Wynagrodzenie Managera wynosi "+salary+ " dodatkowy bonus wynosi "+bonus;

    }
     @Override
     public String YoWork()
    {
        return "Pracownik Manager przepracowal "+i+ " lata";
    }
     public int calculateMonthlySalary()
     {
        s=salary+bonus;

        return s;
     }
    @Override
     public int ChangeBonus()
     {
         Scanner sc=new Scanner(System.in);
         System.out.print("Zmien bonus dla pracownika: ");
         bonus = sc.nextInt();
         sc.close();
         return bonus;

     }


}
