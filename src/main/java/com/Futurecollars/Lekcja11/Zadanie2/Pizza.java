package com.Futurecollars.Lekcja11.Zadanie2;

import java.util.List;

public class Pizza {

    boolean isVegan;
    List<String> ingredients;
    int calories;
    String name;
    public Pizza(String name, boolean isVegetarian, List<String> ingredients, int calories) {
        this.name = name;
        this.isVegan = isVegetarian;
        this.ingredients = ingredients;
        this.calories = calories;
}

    public boolean isVegan() {
        return isVegan;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }
}

