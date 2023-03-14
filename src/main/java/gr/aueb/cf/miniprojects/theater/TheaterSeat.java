package gr.aueb.cf.miniprojects.theater;

class TheaterSeat {

    private final String seatNumber;
    private boolean booked = false;

    TheaterSeat(String seatNumber) {
        this.seatNumber = seatNumber;
    }


    String getSeatNumber() {
        return seatNumber;
    }

    boolean isBooked() {
        return booked;
    }


    boolean reserveSeat() {
        if (!this.booked) {
            this.booked = true;
            System.out.println("Seat with number " + this.seatNumber + " successfully booked");
            return true;
        }
        return false;
    }

    boolean cancel() {
        if (this.booked) {
            this.booked = false;
            System.out.println("Seat with number " + this.seatNumber + " successfully cancelled");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "TheaterSeat" +
                "seatNumber=" + this.seatNumber;
    }
}
