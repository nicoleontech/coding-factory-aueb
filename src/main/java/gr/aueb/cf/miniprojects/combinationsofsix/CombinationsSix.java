package gr.aueb.cf.miniprojects.combinationsofsix;


import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CombinationsSix {

    private final CombinationsSixImporter importer;


    public CombinationsSix() throws CsvValidationException, IOException {
        this.importer = new CombinationsSixImporter();
    }


    public List<List<Integer>> createCombinations(List<Integer> source, List<Integer> comb, int targetSize) {
        if (comb.size() == targetSize) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(comb);
            return result;
        }

        List<List<Integer>> result = new ArrayList<>();
        Iterator<Integer> iterator = source.iterator();
        while (iterator.hasNext()) {
            Integer item = iterator.next();
            iterator.remove();

            List<Integer> newCombination = new ArrayList<>(comb);
            newCombination.add(item);
            result.addAll(createCombinations(new ArrayList<>(source), newCombination, targetSize));
        }
        return result;
    }

}
