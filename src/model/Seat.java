package model;

import client.db.enums.BookingStatus;
import client.db.enums.SeatClass;


public class Seat {
    int id;
    SeatClass seatType;
    double rate;
    int row;
    BookingStatus status;

    public Seat(int id, SeatClass seatType, double rate, int row, BookingStatus status) {
        this.id = id;
        this.seatType = seatType;
        this.rate = rate;
        this.row = row;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SeatClass getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatClass seatType) {
        this.seatType = seatType;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }
}
