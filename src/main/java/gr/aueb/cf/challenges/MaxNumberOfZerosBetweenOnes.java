package gr.aueb.cf.challenges;

/**
 * After converting an input param from decimal number to
 * binary, we want to calculate the max number of 0s, which
 * are included between two 1s.
 * eg: 1000100101 -> here max number of 0s is 3.
 */
public class MaxNumberOfZerosBetweenOnes {


    int findMaxZerosBetweenOnes(int number) {
        char[] binaryArr = Integer.toBinaryString(number).toCharArray();
        int currentCount, totalCountOfZeros = 0;

        for (int i = 0; i < binaryArr.length - 2; i++) {
            if (binaryArr[i] == '1') {
                currentCount = 0;
                for (int j = i + 1; j < binaryArr.length; j++) {
                    if (binaryArr[j] == '0') {
                        currentCount++;
                    }
                    if (binaryArr[j] == '1') {
                        if (currentCount >= totalCountOfZeros) {
                            totalCountOfZeros = currentCount;
                        }
                        break;
                    }
                }
            }

        }
        return totalCountOfZeros;
    }
}
