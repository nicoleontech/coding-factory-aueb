package gr.aueb.cf.challenges;

import java.util.Arrays;

public class MissingNumberInArray {

    int findMissingNumberInArray(int[] arr) {
        Arrays.sort(arr);
        int missingNum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                missingNum = arr[i] + 1;
            }
        }
        return missingNum;
    }
}

