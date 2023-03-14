package gr.aueb.cf.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxSubArrayOfZerosTest {

    MaxNumberOfZerosBetweenOnes sut = new MaxNumberOfZerosBetweenOnes();

    @Test
    void findMaxZerosInSubArray_shouldReturnZero_whenInputNumIsZero() {
        var result = sut.findMaxZerosBetweenOnes(0);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void findMaxZerosInSubArray_shouldReturnZero_whenInputIsOne() {
        var result = sut.findMaxZerosBetweenOnes(1);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void findMaxZerosInSubArray_shouldReturnZero_whenExistsOnlyOne1() {
        var result = sut.findMaxZerosBetweenOnes(8);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void findMaxZerosInSubArray_shouldReturnOne_whenOneZeroBetweenAllOnes() {
        var result = sut.findMaxZerosBetweenOnes(85);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void findMaxZerosInSubArray_shouldReturnOne_whenOnlyOneZeroBetweenAllOnes() {
        var result = sut.findMaxZerosBetweenOnes(47);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void findMaxZerosInSubArray_shouldReturnMaxZeros_whenMultipleZeroBetweenAllOnes_v1() {
        var result = sut.findMaxZerosBetweenOnes(549);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void findMaxZerosInSubArray_shouldReturnMaxZeros_whenMultipleZeroBetweenAllOnes_v2() {
        var result = sut.findMaxZerosBetweenOnes(1030);
        assertThat(result).isEqualTo(7);
    }

    @Test
    void findMaxZerosInSubArray_shouldReturnZero_whenMultipleOnesInTheBeginning() {
        var result = sut.findMaxZerosBetweenOnes(1000);
        assertThat(result).isEqualTo(1);
    }

}