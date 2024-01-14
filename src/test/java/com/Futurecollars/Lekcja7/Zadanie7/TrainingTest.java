package com.Futurecollars.Lekcja7.Zadanie7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainingTest {
    @ParameterizedTest
    @CsvSource({
            "20, 250, 150, 1, 1, 3, 2, Bardzo dobra",
            "45, 350, 165, 2, 2, 2, 2, Bardzo dobra",
            "70, 500, 180, 3, 3, 1, 2, Bardzo dobra",
            "40, 280, 170, 2, 1, 2, 1.7, Dobra"})
    void shouldtEvaluateTraining(int duration, int caloriesBurned, int AverageHeartRate, int gradeDuration,
                                 int gradeCalories, int gradeAverageHeartRate, double AverageScale, String effectiveness) {
        Training training = new Training(duration, caloriesBurned, AverageHeartRate);
        assertEquals(gradeDuration, training.gradeDuration());
        assertEquals(gradeCalories, training.gradeBurnedCalories());
        assertEquals(gradeAverageHeartRate, training.gradeAverageHeartRate());
        assertEquals(AverageScale, training.calculateScaleAverage(), 0.1);
        assertEquals(effectiveness, training.assessTheEffectivenessOfTraining());

    }
}
