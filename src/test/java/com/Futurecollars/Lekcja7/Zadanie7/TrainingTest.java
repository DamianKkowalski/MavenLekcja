package com.Futurecollars.Lekcja7.Zadanie7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TrainingTest {
    @ParameterizedTest
    @CsvSource({
            "20, 250, 150, 1, 1, 3, 2, Bardzo dobra",
            "45, 350, 165, 2, 2, 2, 1.7, Dobra",
            "70, 500, 180, 3, 3, 1, 2.3, Bardzo dobra",
            "40, 280, 170, 2, 1, 2, 1.7, Dobra"   })
    void shouldtEvaluateTraining(int duration, int caloriesBurned, int AverageHeartRate, int gradeDuration,
                                 int gradeCalories, int gradeAverageHeartRate, double AverageScale, String effectiveness)
    {
        Training training = new Training(duration,caloriesBurned,AverageHeartRate );
        int resultGradeDuration = training.gradeDuration(duration);
        int resultGradeCaloriesBurned = training.gradeBurnedCalories(caloriesBurned);
        int resultGradeAverageHeartRate = training.gradeAverageHeartRate(AverageHeartRate);
        double resultScaleAverage=training.calculateScaleAverage(resultGradeDuration,resultGradeCaloriesBurned,resultGradeAverageHeartRate);
        String assesement = training.assessTheEffectivenessOfTraining(resultScaleAverage);
        Assertions.assertEquals(gradeDuration, resultGradeDuration );
        Assertions.assertEquals(gradeCalories, resultGradeCaloriesBurned );
        Assertions.assertEquals(gradeAverageHeartRate, resultGradeAverageHeartRate );
        Assertions.assertEquals(AverageScale, resultScaleAverage, 0.1);
        Assertions.assertEquals(effectiveness , assesement);

    }
}
