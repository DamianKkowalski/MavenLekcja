package com.Futurecollars.Lekcja11.Zadanie3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CinemaHallGroup {

    public static void main(String[] args) {


        List<CinemaHall> cinemaHalls = List.of(
                new CinemaHall("Sala 1", "3D"),
                new CinemaHall("Sala 2", "4D"),
                new CinemaHall("Sala 3", "2D"),
                new CinemaHall("Sala 4", "3D"),
                new CinemaHall("Sala 5", "4D"),
                new CinemaHall("Sala 6", "2D"),
                new CinemaHall("Sala 7", "3D"),
                new CinemaHall("Sala 8", "3D"),
                new CinemaHall("Sala 9", "4D"),
                new CinemaHall("Sala 10", "4D")
        );
        Map<String, Long> hallsGroupedByType = cinemaHalls.stream()
                .collect(Collectors.groupingBy(CinemaHall::getType, Collectors.counting()));
        hallsGroupedByType.forEach((type, count) -> System.out.println("Typ sali " + type + ", liczba sal: " + count));



    }
}
