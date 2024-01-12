package com.Futurecollars.Lekcja11.Zadanie3;

enum RoomType {
    _2D,
    _3D,
    _4D
}
enum HallNumber {
    Sala_1,
    Sala_2,
    Sala_3,
    Sala_4,
    Sala_5,
    Sala_6,
    Sala_7,
    Sala_8,
    Sala_9,
    Sala_10
}

public class CinemaHall {
    private HallNumber name;
    private RoomType type;

    public CinemaHall(HallNumber name, RoomType type)
    {
        this.name = name;
        this.type = type;
    }

    public RoomType getType() {
        return type;
    }
}
