package gr.aueb.cf.miniprojects.combinationsofsix;

import com.opencsv.exceptions.CsvValidationException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CombinationsSixTest {

    CombinationsSix subjectUnderTest = new CombinationsSix();

    public CombinationsSixTest() throws CsvValidationException, IOException {
    }

    @Test
    void createCombinations_returnsEveryPossibleCombination() throws CsvValidationException, IOException {
        var result = subjectUnderTest.createCombinations(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7)),
                new ArrayList<>(), 6);
        assertThat(result).isNotEmpty();
    }

}