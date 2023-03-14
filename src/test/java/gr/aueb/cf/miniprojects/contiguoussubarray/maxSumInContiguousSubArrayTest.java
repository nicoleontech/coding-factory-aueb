package gr.aueb.cf.miniprojects.contiguoussubarray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class maxSumInContiguousSubArrayTest {

    MaxSumInContiguousSubArray sut = new MaxSumInContiguousSubArray();

    @Test
    void findMaxSumInContiguousSubArray_DoesNotReturnSumOfWholeArray(){
        int[] inputArray = {-2, 1, -3, 4, -1, 2, 1,-5, 4};
        assertThat(sut.findMaxSumInContiguousSubArray(inputArray)).
                isNotEqualTo(Arrays.stream(inputArray).sum());
    }

    @Test
    void findMaxSumInContiguousSubArray_returnsElementOfInputArray_WhenLengthOfInputArray_IsOne(){
        int[] inputArray = {-2};
        assertThat(sut.findMaxSumInContiguousSubArray(inputArray)).
                isEqualTo(inputArray[0]);
    }

}