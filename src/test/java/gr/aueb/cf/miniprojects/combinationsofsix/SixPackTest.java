package gr.aueb.cf.miniprojects.combinationsofsix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class SixPackTest {

    @Test
    void sixPack_acceptsListOfSixNumbers() {
        var sut = new SixPack(Arrays.asList(6, 5, 4, 3, 2, 1));
        assertThat(sut.getEntries()).hasSize(6);
    }

    @Test
    void sixPack_DoesNotContainEmptyValues() {
        var sut = new SixPack(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertThat(sut.getEntries().get(0)).isGreaterThan(0);
        assertThat(sut.getEntries().get(1)).isGreaterThan(0);
        assertThat(sut.getEntries().get(2)).isGreaterThan(0);
        assertThat(sut.getEntries().get(3)).isGreaterThan(0);
        assertThat(sut.getEntries().get(4)).isGreaterThan(0);
        assertThat(sut.getEntries().get(5)).isGreaterThan(0);
    }

    @Test
    void sixPack_ThrowsIAE_whenInputArrayDoesNotContainSixNumbers() {
        assertThatThrownBy(() -> new SixPack(Arrays.asList()))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void sixPack_ContainsAtMost4EvenNumbers_returnsTrue_whenNumberOfEvensLessThanFour() {
        var sut = new SixPack(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertThat(sut.containsAtMostFourEvenNumbers()).isTrue();
    }

    @Test
    void sixPack_ContainsAtMost4EvenNumbers_returnsFalse_whenNumberOfEvensMoreThanFour() {
        var sut = new SixPack(Arrays.asList(1, 2, 4, 6, 8, 10));
        assertThat(sut.containsAtMostFourEvenNumbers()).isFalse();
    }

    @Test
    void sixPack_ContainsAtMost4OddNumbers_returnsTrue_whenNumberOfOddsLessThanFour() {
        var sut = new SixPack(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertThat(sut.containsAtMostFourOddNumbers()).isTrue();
    }

    @Test
    void sixPack_ContainsAtMost4OddNumbers_returnsFalse_whenNumberOfOddsMoreThanFour() {
        var sut = new SixPack(Arrays.asList(1, 3, 5, 6, 7, 9));
        assertThat(sut.containsAtMostFourOddNumbers()).isFalse();
    }

    @Test
    void sixPack_containsAtMostTwoContiguous_returnsTrue_whenTwoContiguousNumbers() {
        var sut = new SixPack(Arrays.asList(3, 5, 20, 29, 31, 32));
        assertThat(sut.containsAtMostTwoContiguous()).isTrue();
    }

    @Test
    void sixPack_containsAtMostTwoContiguous_returnsFalse_whenThreeContiguousNumbers() {
        var sut = new SixPack(Arrays.asList(3, 5, 20, 29, 30, 31));
        assertThat(sut.containsAtMostTwoContiguous()).isFalse();
    }

    @Test
    void sixPack_containsAtMostTwoContiguous_returnsFalse_whenThreeContiguousNumbersFromStart() {
        var sut = new SixPack(Arrays.asList(4, 5, 6, 18, 25, 34));
        assertThat(sut.containsAtMostTwoContiguous()).isFalse();
    }

    @Test
    void sixPack_ContainsAtMostThreeSameNumbersInTheEnd_returnsTrue() {
        var sut = new SixPack(Arrays.asList(1, 2, 3, 4, 4, 4));
        assertThat(sut.containsAtMostThreeSameNumbersInTheEnd()).isTrue();
    }

    @Test
    void sixPack_ContainsAtMostThreeSameNumbersInTheEnd_returnsFalse() {
        var sut = new SixPack(Arrays.asList(1, 2, 4, 4, 4, 4));
        assertThat(sut.containsAtMostThreeSameNumbersInTheEnd()).isFalse();
    }

    @Test
    void sixPack_ContainsAtMostThreeNumbersInSameTen_returnsTrue() {
        var sut = new SixPack(Arrays.asList(1, 2, 12, 14, 15, 20));
        assertThat(sut.containsAtMostThreeNumbersInSameTen()).isTrue();
    }

    @Test
    void sixPack_ContainsAtMostThreeNumbersInSameTen_returnsFalse() {
        var sut = new SixPack(Arrays.asList(1, 10, 12, 14, 15, 20));
        assertThat(sut.containsAtMostThreeNumbersInSameTen()).isFalse();
    }


}