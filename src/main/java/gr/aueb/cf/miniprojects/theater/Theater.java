package gr.aueb.cf.miniprojects.theater;

import java.util.ArrayList;
import java.util.List;

class Theater {

    private final String name;
    private List<TheaterSeat> seats = new ArrayList<>();

    public Theater(String name, int rows, int columns) {
        this.name = name;
        int lastColumn = 'A' + (columns - 1);
        for (char column = 'A'; column <= lastColumn; column++) {
            for (int row = 1; row <= rows; row++) {
                TheaterSeat theaterSeat = new TheaterSeat(column + String.format("%02d", row));
                this.seats.add(theaterSeat);
            }
        }
    }


    public List<TheaterSeat> getSeats() {
        return seats;
    }

    boolean reserveSeat(String seatNumber) {
        TheaterSeat requestedSeat = null;
        for (TheaterSeat theaterSeat : this.seats) {
            if (theaterSeat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = theaterSeat;
                break;
            }
        }
        if (requestedSeat == null) {
            System.out.println("No seat with seat number" + seatNumber);
            return false;
        }
        return requestedSeat.reserveSeat();
    }

    boolean cancelReservation(String seatNumber) {
        TheaterSeat cancelledSeat = null;
        for (TheaterSeat theaterSeat : this.seats) {
            if (theaterSeat.getSeatNumber().equals(seatNumber)) {
                cancelledSeat = theaterSeat;
                break;
            }
        }
        if (cancelledSeat == null) {
            System.out.println("No seat with seat number" + seatNumber);
            return false;
        }
        return cancelledSeat.cancel();
    }
}
