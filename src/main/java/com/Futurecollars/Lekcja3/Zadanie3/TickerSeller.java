package com.Futurecollars.Lekcja3.Zadanie3;

 class TicketSeller extends BaseEmployee{
     int i=2023-YoEmployment;
    public TicketSeller(String name, String surname, int salary, int YoEmployment)
    {
        super(name, surname, salary, YoEmployment);

    }
     @Override
     public String SalaryPrint()
    {
        return "Wynagrodzenie TickerSeller wynosi "+salary;

    }

     @Override
     public int calculateMonthlySalary() {
         return 0;
     }

     @Override
    public String YoWork()
    {
        return "Pracownik TicketSeller przepracowal " + i +" lata";
    }


}


