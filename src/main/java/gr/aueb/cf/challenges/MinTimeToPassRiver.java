package gr.aueb.cf.challenges;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MinTimeToPassRiver {

    int getMinTime(int endingPos, int[] pointsArr) {
        int maxSecond = -1;
        Map<Integer, Integer> pointsWithLeavesPerSec = new HashMap<>();

        for (int i = 0; i < pointsArr.length; i++) {
            if (!pointsWithLeavesPerSec.containsKey(pointsArr[i]) && pointsArr[i] <= endingPos) {
                pointsWithLeavesPerSec.put(pointsArr[i], i);
                if (pointsWithLeavesPerSec.size() == endingPos) {
                    maxSecond = Collections.max(pointsWithLeavesPerSec.values());
                }
            }
        }

        return maxSecond;
    }


}
