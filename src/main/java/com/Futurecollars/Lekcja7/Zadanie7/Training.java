package com.Futurecollars.Lekcja7.Zadanie7;

public class Training {
    int duration;
    int burnedCalories;
    int averageHeartRate;

    public Training(int duration, int burnedCalories, int averageHeartRate) {
        this.duration = duration;
        this.burnedCalories = burnedCalories;
        this.averageHeartRate = averageHeartRate;
    }

    public int getDuration() {
        return duration;
    }

    public int getBurnedCalories() {
        return burnedCalories;
    }

    public int getAverageHeartRate() {
        return averageHeartRate;
    }

    public int gradeDuration(int duration)
    {
        if (duration < 30) {
            return 1;
        } else if (duration <= 60) {
            return 2;
        } else {
            return 3;
        }
    }
    public int gradeBurnedCalories(int burnedCalories)
    {
        if (burnedCalories < 300) {
            return 1;
        } else if (burnedCalories <= 400) {
            return 2;
        } else {
            return 3;
        }
    }
    public int gradeAverageHeartRate(int averageHeartRate) {
        if (averageHeartRate < 160) {
            return 3;
        } else if (averageHeartRate <= 175) {
            return 2;
        } else {
            return 1;
        }
    }
    public double calculateScaleAverage(int gradeDuration, int gradeBurnedCalories, int gradeAverageHeartRate) {
        double scaleDuration = 1;
        double scaleBurnedCalories = 2;
        double scaleAverageHeartRate = 3;

        double sum = (gradeDuration * scaleDuration) +
                (gradeBurnedCalories * scaleBurnedCalories) +
                (gradeAverageHeartRate * scaleAverageHeartRate);

        double sumScale = scaleDuration + scaleBurnedCalories + scaleAverageHeartRate;

        return sum / sumScale;
    }
    public String assessTheEffectivenessOfTraining(double weightenedAverage) {
        if (weightenedAverage < 1.2) {
            return "Niska";
        } else if (weightenedAverage < 2) {
            return "Dobra";
        } else if (weightenedAverage < 3) {
            return "Bardzo dobra";
        } else {
            return "Doskonała";
        }
    }
    public void ocenITrening(Training trening) {
        int gradeDuration = gradeDuration(trening.getDuration());
        int gradeBurnedCalories = gradeBurnedCalories(trening.getBurnedCalories());
        int gradeAverageHeartRate = gradeAverageHeartRate(trening.getAverageHeartRate());

        double ScaleAverage = calculateScaleAverage(gradeDuration, gradeBurnedCalories, gradeAverageHeartRate);

        String gradeEfectiveness = assessTheEffectivenessOfTraining(ScaleAverage);

        // Wyświetlanie wyników
        System.out.println("Ocena długości treningu: " + gradeDuration );
        System.out.println("Ocena spalonych kalorii: " + gradeBurnedCalories);
        System.out.println("Ocena średniego tętna: " + gradeAverageHeartRate);
        System.out.println("Średnia ważona: " + ScaleAverage);
        System.out.println("Ocena efektywności treningu: " + gradeEfectiveness);
    }
}

