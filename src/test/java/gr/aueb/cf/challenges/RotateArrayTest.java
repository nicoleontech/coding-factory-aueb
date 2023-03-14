package gr.aueb.cf.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RotateArrayTest {

    RotateArray sut = new RotateArray();

    @Test
    void rotate_returnsNewArrayNotNull() {
        var initialArray = new int[]{5, 8, 12, 17, 3};
        var result = sut.rotate(initialArray, 2);
        assertThat(result).isNotNull();
    }

    @Test
    void rotate_returnsNewArrayWithEqualLengthToInitialArray() {
        var initialArray = new int[]{5, 8, 12, 17, 3};
        var result = sut.rotate(initialArray, 2);
        assertThat(result.length).isEqualTo(initialArray.length);
    }

    @Test
    void rotate_returnsNewArray_firstElementIsShiftedByk() {
        var initialArray = new int[]{5, 8, 12, 17, 3};
        var k = 2;
        var result = sut.rotate(initialArray, k);
        assertThat(result[0]).isEqualTo(initialArray[initialArray.length - k]);
    }

    @Test
    void rotate_returnsNewArray_secondElementIsShiftedByk() {
        var initialArray = new int[]{5, 8, 12, 17, 3};
        var k = 2;
        var result = sut.rotate(initialArray, k);
        assertThat(result[1]).isEqualTo(initialArray[initialArray.length - 1]);
    }

    @Test
    void rotate_returnsNewArray_thirdElementIsShiftedByk() {
        var initialArray = new int[]{5, 8, 12, 17, 3};
        var k = 2;
        var result = sut.rotate(initialArray, k);
        assertThat(result[2]).isEqualTo(initialArray[0]);
    }

}