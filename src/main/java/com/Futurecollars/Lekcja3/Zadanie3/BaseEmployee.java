package com.Futurecollars.Lekcja3.Zadanie3;

public abstract class BaseEmployee {

    protected String name;
    protected String surname;
    protected int salary;
    protected int YoEmployment;

    public BaseEmployee(String name, String surname, int salary, int yoEmployment) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.YoEmployment = yoEmployment;
    }

    String YoWork() {
        return null;
    }

    String SalaryPrint() {
        return null;
    }

    public abstract int calculateMonthlySalary();

    public int ChangeBonus() {
        return 0;
    }


}
