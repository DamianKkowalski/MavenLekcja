package com.Futurecollars.Lekcja11.Zadanie2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PizzaDescriptions {
    public static void main(String[] args) {
        List<Pizza> menu = new ArrayList<>();
        menu.add(new Pizza("Margharita", true, List.of("mozarella","pomidor"),700));
        menu.add(new Pizza("Vegetariana", true, List.of("mozarella", "papryka", "cebula", "pomidor"), 750));
        menu.add(new Pizza("Capricciosa", false, List.of("mozarella", "pieczarki", "salami", "pomidor"), 850));
        menu.add(new Pizza("Pepperoni", false, List.of("mozarella", "salami", "papryka"), 1000));
        menu.add(new Pizza("Mediterranean", true, List.of("mozarella", "pomidor", "cebula", "papryka"), 700));
        menu.add(new Pizza("Hawaiian", false, List.of("mozarella", "szynka"), 800));
        menu.add(new Pizza("BBQ Chicken", false, List.of("mozarella", "kurczak"), 950));
        menu.add(new Pizza("Celery Surprise", true, List.of("mozarella", "seler", "pomidor"), 600));

        System.out.println("Vegetarians pizza's list: \n");
        menu.stream()
                .filter(Pizza::isVegan)
                .map(Pizza::getName)
                .forEach(System.out::println);


        System.out.println("\nPizza's list with alergens: ");
        menu.stream()
                .filter(pizza -> pizza.getIngredients().contains("seler"))
                .map(Pizza::getName)
                .forEach(System.out::println);


        boolean existVegeWithTomatoAndPepper = menu.stream()
                .anyMatch(pizza -> pizza.isVegan()
                        && pizza.getIngredients().contains("pomidor")
                        && pizza.getIngredients().contains("papryka"));
        System.out.println("\nIs exsisting at least one vegan pizza with tomato and pepper?\n" + existVegeWithTomatoAndPepper);


        boolean hasMozarella = menu.stream()
                .allMatch(pizza -> pizza.getIngredients().contains("mozarella"));
        System.out.println("\nAll of them have mozarella? \n" + hasMozarella);


        Optional<Pizza> highestCalories = menu.stream()
                .max(Comparator.comparingInt(Pizza::getCalories));
        highestCalories.ifPresent(pizza -> System.out.println("Pizza with highest level of calories \n"+ pizza.getName()));


        Optional<Pizza> lowestCalories = menu.stream()
                .min(Comparator.comparingInt(Pizza::getCalories));
        lowestCalories.ifPresent(pizza -> System.out.println("Pizza with lowest level of calories \n"+ pizza.getName()));


    }
}
