package gr.aueb.cf.challenges;

/**
 * Right rotate an array shifted by a value (k)
 * and return this new array.
 * e.g. initial array = [5,8,12,17,3]
 * returned array will be [17,3,5,8,12]
 */
public class RotateArray {

    int[] rotate(int[] arr, int k) {
        var result = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                result[i] = arr[arr.length - k + i];
            } else {
                result[i] = arr[i - k];
            }
        }
        return result;
    }


}

