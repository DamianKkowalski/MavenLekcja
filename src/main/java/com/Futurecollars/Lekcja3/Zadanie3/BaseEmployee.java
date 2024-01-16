package com.Futurecollars.Lekcja3.Zadanie3;

public abstract class BaseEmployee {

    protected String name;
    protected String surname;
    protected int salary;
    protected int yearOfEmployment;

    public BaseEmployee(String name, String surname, int salary, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.yearOfEmployment = yearOfEmployment;
    }

    int getYearsOfWork() {
        return yearOfEmployment;
    }

    public int calculateMonthlySalary() {
        return salary;
    }

    public int changeBonus() {
        return 0;
    }
}
