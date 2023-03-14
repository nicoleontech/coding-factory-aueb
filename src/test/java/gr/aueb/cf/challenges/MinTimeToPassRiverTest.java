package gr.aueb.cf.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinTimeToPassRiverTest {

    MinTimeToPassRiver sut = new MinTimeToPassRiver();


    @Test
    void getMinTime_returnsMinusOne_whenPath_isNotComplete() {
        int[] pointsArr = new int[]{
                2, 2, 1, 6, 3, 5, 3
        };
        int result = sut.getMinTime(5, pointsArr);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void getMinTime_returnsMaxValueFromMap_whenPath_isComplete() {
        int[] pointsArr = new int[]{
                2, 2, 1, 4, 6, 3, 5, 3
        };
        int result = sut.getMinTime(5, pointsArr);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void getMinTime_returnsMinusOne_whenEndingPos_isNotPresentInArray() {
        int[] pointsArrWithoutEndingPos = new int[]{
                1, 1, 2, 2, 5, 3, 1
        };
        int result = sut.getMinTime(4, pointsArrWithoutEndingPos);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void getMinTime_returnsIndexOfPoint_whenThePathIsComplete() {
        int[] pointsArr = new int[]{
                1, 1, 2, 2, 4, 3, 1
        };
        int result = sut.getMinTime(4, pointsArr);
        assertThat(result).isEqualTo(5);
    }

}