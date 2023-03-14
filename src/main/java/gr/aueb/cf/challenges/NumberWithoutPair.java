package gr.aueb.cf.challenges;

/**
 * Using the bitwise operator ^, the complexity of solving this is O(n).
 */
public class NumberWithoutPair {

    int findNumberWithoutPair(int[] arr) {
        int singleElement = 0;
        for (int num : arr) {
            singleElement = singleElement ^ num;
        }
        return singleElement;
    }
}
