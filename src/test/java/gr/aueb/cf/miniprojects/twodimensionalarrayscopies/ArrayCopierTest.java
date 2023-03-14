package gr.aueb.cf.miniprojects.twodimensionalarrayscopies;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayCopierTest {

    int[][] initialArray = new int[2][2];
    ArrayCopier sut = new ArrayCopier();

    @Test
    void makeShallowCopy_returnsACopyOfTheInput() {
        var result = sut.makeShallowCopy(initialArray);
        assertThat(result).isNotNull();
        assertThat(result).isEqualTo(initialArray);
    }

    @Test
    void makeShallowCopy_ChangesTheElementsOfTheInitialArray() {
        var result = sut.makeShallowCopy(initialArray);
        result[0][0] = 15;
        assertThat(result).isEqualTo(initialArray);
    }

    @Test
    void makeShallowCopy_ChangeOrderOfElementsOfInitialArray() {
        var result = sut.makeShallowCopy(initialArray);
        result[0][0] = 15;
        var temp = result[0][1];
        result[0][1] = result[0][0];
        result[0][0] = temp;
        assertThat(result).isEqualTo(initialArray);
    }

    @Test
    void makeDeepCopy_returnsDeepCopy_DifferentFromInitialArray_ByReference() {
        var deepCopy = sut.makeDeepCopy(initialArray);
        assertThat(deepCopy != initialArray);
    }

    @Test
    void makeDeepCopy_returnsDeepCopy_EqualToInitialArray_ByValue() {
        var deepCopy = sut.makeDeepCopy(initialArray);
        assertThat(deepCopy).isEqualTo(initialArray);
    }

    @Test
    void makeDeepCopy_DoesNotChangeElementsOfInitialArray() {
        var deepCopy = sut.makeDeepCopy(initialArray);
        deepCopy[0][0] = 20;
        assertThat(deepCopy).isNotEqualTo(initialArray);
    }

}
