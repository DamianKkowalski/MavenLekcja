package com.Futurecollars.Lekcja11.Zadanie3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CinemaHallGroup {

    public static void main(String[] args) {


        List<CinemaHall> cinemaHalls = List.of(
                new CinemaHall(HallNumber.Sala_1, RoomType._3D),
                new CinemaHall(HallNumber.Sala_2, RoomType._3D),
                new CinemaHall(HallNumber.Sala_3, RoomType._3D),
                new CinemaHall(HallNumber.Sala_4, RoomType._3D),
                new CinemaHall(HallNumber.Sala_5, RoomType._2D),
                new CinemaHall(HallNumber.Sala_6, RoomType._4D),
                new CinemaHall(HallNumber.Sala_7, RoomType._2D),
                new CinemaHall(HallNumber.Sala_8, RoomType._3D),
                new CinemaHall(HallNumber.Sala_9, RoomType._2D),
                new CinemaHall(HallNumber.Sala_10, RoomType._4D)
        );
        Map<RoomType, Long> hallsGroupedByType = cinemaHalls.stream()
                .collect(Collectors.groupingBy(CinemaHall::getType, Collectors.counting()));
        hallsGroupedByType.forEach((type, count) -> System.out.println("Typ sali " + type + ", liczba sal: " + count));



    }
}
