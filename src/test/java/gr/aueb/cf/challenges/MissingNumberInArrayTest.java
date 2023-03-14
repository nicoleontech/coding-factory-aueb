package gr.aueb.cf.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MissingNumberInArrayTest {

    MissingNumberInArray sut = new MissingNumberInArray();

    @Test
    void findMissingNumberInArray_findsMissingNumber_whenArrayIsSorted() {
        var result = sut.findMissingNumberInArray(new int[]{1, 2, 3, 5});
        assertThat(result).isEqualTo(4);
    }

    @Test
    void findMissingNumberInArray_findsMissingNumber_whenArrayIsUnsorted() {
        var result = sut.findMissingNumberInArray(new int[]{2, 3, 1, 5});
        assertThat(result).isEqualTo(4);
    }

    @Test
    void findMissingNumberInArray_findsMissingNumber_whenArrayIncludesNumsGreaterThan10() {
        var result = sut.findMissingNumberInArray(new int[]{10, 14, 12, 13});
        assertThat(result).isEqualTo(11);
    }
}


