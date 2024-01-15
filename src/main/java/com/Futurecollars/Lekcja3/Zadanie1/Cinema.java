package com.Futurecollars.Lekcja3.Zadanie1;

class Cinema {


    private final int row;
    private final int seat;

    private SeatStatus seatStatus;

    public Cinema(int row, int seat) {
        this.row = row;
        this.seat = seat;
        this.seatStatus = SeatStatus.FREE;
    }
    public void occupySeat() {
        seatStatus = SeatStatus.OCCUPIED;
    }

    public void freeSeat() {
        seatStatus = SeatStatus.FREE;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "row=" + row +
                ", seat=" + seat +
                ", seatStatus=" + seatStatus +
                '}';
    }
}
