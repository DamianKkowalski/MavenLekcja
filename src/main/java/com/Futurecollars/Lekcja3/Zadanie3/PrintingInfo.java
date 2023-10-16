package com.Futurecollars.Lekcja3.Zadanie3;

public class PrintingInfo {
    public static void main(String[] args) {
        BaseEmployee manager= new Manager("Dariusz", "Nowak",5000,2020,500);
        BaseEmployee ticketseller = new TicketSeller("Joanna", "Nowak", 3000, 2015);
        System.out.println(manager.SalaryPrint());
        System.out.println(manager.YoWork());
        System.out.println(ticketseller.SalaryPrint());
        System.out.println(ticketseller.YoWork());
        System.out.println("Pensja managera wynosi "+manager.calculateMonthlySalary());
        manager.ChangeBonus();
        System.out.println("Pensja managera wynosi "+manager.calculateMonthlySalary());
    }
}
