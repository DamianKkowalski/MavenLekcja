package com.Futurecollars.Lekcja7.Zadanie8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class EmployeeSalaryCalculatorTest {
    @Test
    void testCalculateEmployeeSalary() {
        // Prepare mocks
        BasicSalaryService mockBasicSalaryService = mock(BasicSalaryService.class);
        SaturdayBonusService mockSaturdayBonusService = mock(SaturdayBonusService.class);

        // Configure mocks
        when(mockBasicSalaryService.getBasicSalary()).thenReturn(5000.0);
        when(mockSaturdayBonusService.getSaturdayBonus()).thenReturn(100.0);

        // Create calculator
        EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator(mockBasicSalaryService, mockSaturdayBonusService);

        // Call the method to be tested
        double salary = calculator.calculateEmployeeSalary(200.0, 4);

        // Check the result
        assertEquals(5600.0, salary, 0.001);

        // Verify that methods on mocks were called
        verify(mockBasicSalaryService).getBasicSalary();
        verify(mockSaturdayBonusService).getSaturdayBonus();
    }
}