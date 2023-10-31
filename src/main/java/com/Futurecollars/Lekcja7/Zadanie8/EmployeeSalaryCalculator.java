package com.Futurecollars.Lekcja7.Zadanie8;

public class EmployeeSalaryCalculator {
    private BasicSalaryService basicSalaryService;
    private SaturdayBonusService saturdayBonusService;
    public EmployeeSalaryCalculator(BasicSalaryService basicSalaryService, SaturdayBonusService saturdayBonusService) {
        this.basicSalaryService = basicSalaryService;
        this.saturdayBonusService = saturdayBonusService;
    }
    public double calculateEmployeeSalary(double oneTimeBonus, int numberOfSaturdays) {
        double basicSalary = basicSalaryService.getBasicSalary();
        double saturdayBonus = saturdayBonusService.getSaturdayBonus();

        return basicSalary + oneTimeBonus + (saturdayBonus * numberOfSaturdays);
    }
}
