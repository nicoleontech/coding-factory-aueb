package gr.aueb.cf.ch6;

import gr.aueb.cf.homework.ch6.GetLowAndHighIndexApp;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GetLowAndHighIndexAppTest {

    //or empty
    @Test
    void methodThrowsIAE_whenParamArrayIsNull() {
        assertThatThrownBy(() -> GetLowAndHighIndexApp.getLowAndHighIndexOf(null, 8))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void whenKeyExistsOnlyInOneIndex_returnThisIndex() {
        int[] arrUnderTest = {4, 5, 8, 10};
        int keyUnderTest = 4;
        var result = GetLowAndHighIndexApp.getLowAndHighIndexOf(arrUnderTest, keyUnderTest);
        assertThat(result[0]).isEqualTo(0);
    }

    @Test
    void whenKeyExistsInTwoIndices_returnTheLowIndex() {
        int[] arrUnderTest = {4, 4, 5, 8, 10};
        int keyUnderTest = 4;
        var result = GetLowAndHighIndexApp.getLowAndHighIndexOf(arrUnderTest, keyUnderTest);
        assertThat(result[0]).isEqualTo(0);
    }

    @Test
    void whenKeyExistsInThreeIndices_returnTheLowestIndex() {
        int[] arrUnderTest = {3, 4, 5, 5, 5, 8, 10};
        int keyUnderTest = 5;
        var result = GetLowAndHighIndexApp.getLowAndHighIndexOf(arrUnderTest, keyUnderTest);
        assertThat(result[0]).isEqualTo(2);
    }

    @Test
    void whenKeyExistsInTwoIndices_secondIsGreaterThanFirst() {
        int[] arrUnderTest = {3, 4, 5, 5, 5, 8, 10};
        int keyUnderTest = 5;
        var result = GetLowAndHighIndexApp.getLowAndHighIndexOf(arrUnderTest, keyUnderTest);
        assertThat(result[1]).isGreaterThan(result[0]);
    }

    @Test
    void whenKeyExistsInThreeIndices_returnTheHighestIndex() {
        int[] arrUnderTest = {3, 4, 5, 5, 5, 8, 10};
        int keyUnderTest = 5;
        var result = GetLowAndHighIndexApp.getLowAndHighIndexOf(arrUnderTest, keyUnderTest);
        assertThat(result[1]).isEqualTo(4);
    }

}
