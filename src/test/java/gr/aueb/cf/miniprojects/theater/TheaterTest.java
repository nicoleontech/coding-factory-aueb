package gr.aueb.cf.miniprojects.theater;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TheaterTest {

    @Test
    void theater_lastTheaterSeat_isL30() {
        var sut = new Theater("National Theater", 30, 12);
        var listOfSeats = sut.getSeats();
        var lastSeat = listOfSeats.get(listOfSeats.size() - 1);
        assertThat(lastSeat.getSeatNumber()).isEqualTo("L30");
    }

    @Test
    void theater_reserveSeat_returnsFalse_whenTryToBookSameSeat() {
        var sut = new Theater("National Theater", 30, 12);
        assertThat(sut.reserveSeat("A12")).isTrue();
        assertThat(sut.reserveSeat("A12")).isFalse();
    }

    @Test
    void theater_reserveSeat_returnsFalse_whenSeatWithSeatNum_notFound() {
        var sut = new Theater("National Theater", 30, 12);
        assertThat(sut.reserveSeat("L33")).isFalse();
    }

    @Test
    void theater_cancelReservation_returnsTrue_whenSeatWasBooked() {
        var sut = new Theater("National Theater", 30, 12);
        sut.reserveSeat("A12");
        assertThat(sut.cancelReservation("A12")).isTrue();
    }

    @Test
    void theater_cancelReservation_returnsFalse_whenSeatWithSeatNum_notFound() {
        var sut = new Theater("National Theater", 30, 12);
        assertThat(sut.cancelReservation("L33")).isFalse();
    }


}