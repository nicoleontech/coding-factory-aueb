package gr.aueb.cf.miniprojects.combinationsofsix;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationsSixImporter {

    private List<Integer> importedNumbers;

    public CombinationsSixImporter() throws IOException, CsvValidationException {
        List<Integer> nums = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\localadmin\\numbers.csv"))) {
            String[] values;
            while ((values = csvReader.readNext()) != null) {
                for (String value : values) {
                    nums.add(Integer.parseInt(value));
                    Collections.sort(nums);
                    this.importedNumbers = nums;
                }
            }
        }
    }

    public List<Integer> getImportedNumbers() {
        return importedNumbers;
    }

}


