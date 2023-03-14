package gr.aueb.cf.miniprojects.contiguoussubarray;


class MaxSumInContiguousSubArray {

    int findMaxSumInContiguousSubArray(int[] inputArray) {
        int endingMax = Integer.MIN_VALUE;
        int localMax = 0;
        for (int num : inputArray) {
            localMax = localMax + num;
            if (endingMax < localMax) {
                endingMax = localMax;
            }
            if (localMax < 0) {
                localMax = 0;
            }
        }
        return endingMax;
    }
}
