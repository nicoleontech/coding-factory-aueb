package gr.aueb.cf.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SmallestMissingPositiveTest {

    SmallestMissingPositive sut = new SmallestMissingPositive();

    @Test
    void getSmallestMissingPositive_returnsSmallestPositiveNumber_whenInputArr_containsNegatives() {
        int[] arr = new int[]{
                -1, -2, -3, -4, 0
        };
        int result = sut.getSmallestMissingPositive(arr);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void getSmallestMissingPositive_returnsSmallestPositiveNumber_whenInputArr_containsZero() {
        int[] arr = new int[]{
                0, 5, 7, 9, 10
        };
        int result = sut.getSmallestMissingPositive(arr);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void getSmallestMissingPositive_returnsSmallestPositiveNumber_whenInputArr_isNotSorted() {
        int[] arr = new int[]{
                2, 1, 6, 3, 5, 9
        };
        int result = sut.getSmallestMissingPositive(arr);
        assertThat(result).isEqualTo(4);
    }
}