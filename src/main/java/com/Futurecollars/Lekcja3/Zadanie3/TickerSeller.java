package com.Futurecollars.Lekcja3.Zadanie3;

class TicketSeller extends BaseEmployee {


    public TicketSeller(String name, String surname, int salary, int YoEmployment) {
        super(name, surname, salary, YoEmployment);
    }

    @Override
    public int calculateMonthlySalary() {
        return salary;
    }

    @Override
    public int getYearsOfWork() {
        return 2024 - yearOfEmployment;
    }

}


