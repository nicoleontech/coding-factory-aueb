package gr.aueb.cf.miniprojects.combinationsofsix;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class SixPack {

    static final int MAX_LIMIT_OF_EVEN_NUMBERS = 4;
    static final int MAX_LIMIT_OF_ODD_NUMBERS = 4;
    static final int MAX_LIMIT_OF_CONTIGUOUS_NUMBERS = 2;
    static final int MAX_LENGTH = 6;
    static final int MAX_LIMIT_OF_SAME_ENDING_NUMBERS = 3;
    private List<Integer> entries;

    SixPack(List<Integer> entries) {
        if (entries == null || entries.size() != MAX_LENGTH) {
            throw new IllegalArgumentException("Entry must contain 6 numbers");
        }
        this.entries = entries;
    }

    List<Integer> getEntries() {
        return entries;
    }

    boolean containsAtMostFourEvenNumbers() {
        var count = 0;
        for (int entry : entries) {
            if (entry % 2 == 0) {
                count++;
            }
        }
        return count <= MAX_LIMIT_OF_EVEN_NUMBERS;
    }

    boolean containsAtMostFourOddNumbers() {
        var count = 0;
        for (int entry : entries) {
            if (entry % 2 == 1) {
                count++;
            }
        }
        return count <= MAX_LIMIT_OF_ODD_NUMBERS;
    }

    boolean containsAtMostTwoContiguous() {
        int count = 1;
        for (int i = 0; i < entries.size() - 1; i++) {
            Integer nextConsecutive = entries.get(i) + 1;
            if (entries.get(i + 1) == nextConsecutive) {
                count++;
            }
        }
        return count <= MAX_LIMIT_OF_CONTIGUOUS_NUMBERS;
    }

    boolean containsAtMostThreeSameNumbersInTheEnd() {
        var count = 1;
        for (int i = entries.size() - 1; i > 2; i--) {
            if (entries.get(i) == entries.get(i - 1)) {
                count++;
            }

        }

        return count <= MAX_LIMIT_OF_SAME_ENDING_NUMBERS;
    }

    boolean containsAtMostThreeNumbersInSameTen() {
        var count = 0;
        List<Integer> tens = new ArrayList<>();
        for (int entry : entries) {
            int ten = entry / 10;
            tens.add(ten);
        }
        var result = tens.stream().collect(Collectors.groupingBy(ten -> ten));
        for (List<Integer> value : result.values()) {
            if (value.size() > 3) {
                return false;
            }
        }
        return true;
    }
}
