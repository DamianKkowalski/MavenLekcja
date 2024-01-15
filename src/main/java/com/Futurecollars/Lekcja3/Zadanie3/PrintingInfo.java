package com.Futurecollars.Lekcja3.Zadanie3;

public class PrintingInfo {
    public static void main(String[] args) {
        BaseEmployee manager = new Manager("Dariusz", "Nowak", 5000, 2020, 500);
        BaseEmployee ticketseller = new TicketSeller("Joanna", "Nowak", 3000, 2015);
        System.out.println("Salary of the manager: " + manager.calculateMonthlySalary());
        System.out.println("Years of work of manager: " + manager.getYearsOfWork());
        System.out.println("Salary of the ticketseller: " + ticketseller.calculateMonthlySalary());
        System.out.println("Years of work of ticketseller: " + ticketseller.getYearsOfWork());
        System.out.println("Salary of the manager " + manager.calculateMonthlySalary());
        manager.changeBonus();
        System.out.println("Salary of the manager " + manager.calculateMonthlySalary());
    }
}
