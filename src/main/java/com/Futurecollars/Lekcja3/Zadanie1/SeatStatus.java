package com.Futurecollars.Lekcja3.Zadanie1;

public enum SeatStatus {
    OCCUPIED("Occupied"),
    FREE("Free");
    private final String status;

    SeatStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SeatStatus{" +
                "status='" + status + '\'' +
                '}';
    }
}
