package gr.aueb.cf.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberWithoutPairTest {

    NumberWithoutPair sut = new NumberWithoutPair();

    @Test
    void findNumberWithoutPair_returnsSingleNumber() {
        var result = sut.findNumberWithoutPair(new int[]{1, 1, 2, 2, 4});
        assertThat(result).isEqualTo(4);
    }

    @Test
    void findNumberWithoutPair_returnsSingleNumber_whenArrNotSorted() {
        var result = sut.findNumberWithoutPair(new int[]{12, 11, 13, 13, 11});
        assertThat(result).isEqualTo(12);
    }

    @Test
    void findNumberWithoutPair_returnsSingleNumber_whenArrNotSorted_v2() {
        var result = sut.findNumberWithoutPair(new int[]{10, 12, 14, 20, 14, 12, 10});
        assertThat(result).isEqualTo(20);
    }


    @Test
    void findNumberWithoutPair_returnsZero_WhenNoNumberWithoutPair() {
        var result = sut.findNumberWithoutPair(new int[]{1, 1, 2, 2, 4, 4});
        assertThat(result).isEqualTo(0);
    }

}