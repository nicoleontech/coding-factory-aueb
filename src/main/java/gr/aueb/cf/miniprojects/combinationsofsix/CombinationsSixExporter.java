package gr.aueb.cf.miniprojects.combinationsofsix;

import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class CombinationsSixExporter {

    private static final int TARGET_SIZE = 6;

    public static void main(String[] args) throws IOException, CsvValidationException {
        File outFile = new File("C:\\Users\\localadmin\\combinations.txt");
        PrintStream printStream = new PrintStream(outFile);

        CombinationsSix combinationsSix = new CombinationsSix();
        CombinationsSixImporter importer = new CombinationsSixImporter();

        var result = combinationsSix.createCombinations(importer.getImportedNumbers(),
                new ArrayList<>(), TARGET_SIZE);
        for (var res : result) {
            SixPack sixPack = new SixPack(res);
            if (sixPack.containsAtMostFourEvenNumbers()
                    && sixPack.containsAtMostFourOddNumbers()
                    && sixPack.containsAtMostTwoContiguous()
                    && sixPack.containsAtMostThreeSameNumbersInTheEnd()
                    && sixPack.containsAtMostThreeNumbersInSameTen()) {
                printStream.println(res);
            }
        }
    }
}
