package gr.aueb.cf.miniprojects.theater;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TheaterSeatTest {

    @Test
    void theaterSeat_allSeatsAreNotBookedInTheBeginning() {
        var sut = new TheaterSeat("A12");
        assertThat(sut.isBooked()).isFalse();
    }

    @Test
    void theaterSeat_ifTheaterSeatIsNotBooked_canReserveTheSeat() {
        var sut = new TheaterSeat("A12");
        assertThat(sut.reserveSeat()).isTrue();
    }

    @Test
    void theaterSeat_ifTheaterSeatIsReservedOnce_bookedBecomesTrue() {
        var sut = new TheaterSeat("A12");
        sut.reserveSeat();
        assertThat(sut.isBooked()).isTrue();
    }

    @Test
    void theaterSeat_ifTheaterSeatIsReserved_canCancelReservation() {
        var sut = new TheaterSeat("A12");
        sut.reserveSeat();
        assertThat(sut.cancel()).isTrue();
    }
}