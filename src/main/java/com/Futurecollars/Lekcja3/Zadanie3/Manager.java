package com.Futurecollars.Lekcja3.Zadanie3;

import java.util.Scanner;

class Manager extends BaseEmployee {

    int bonus;

    public Manager(String name, String surname, int salary, int yearOfEmployement, int bonus) {
        super(name, surname, salary, yearOfEmployement);
        this.bonus = bonus;
    }

    @Override
    public int calculateMonthlySalary() {
        return salary + bonus;

    }

    @Override
    public int getYearsOfWork() {
        return (2024 - yearOfEmployment);
    }


    @Override
    public int changeBonus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Change bonus for the manager ");
        bonus = sc.nextInt();
        sc.close();
        return bonus;

    }


}
