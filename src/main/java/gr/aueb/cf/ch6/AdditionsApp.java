package gr.aueb.cf.ch6;

/**
 * In the same way, we could also calculate multiplication or division!
 */
public class AdditionsApp {

    public static void main(String[] args) {

        int[] arr = {1, 9, 9};
        int[] arrOut = addOne(arr);

        for (int num : arrOut) {
            System.out.print(num + " ");
        }

        int[] arr1 = {9, 9, 9, 6, 7, 1, 2};
        int[] arr2 = {9, 9, 9, 8, 6, 3, 5};

        int[] sumArray = addTwoInts(arr1, arr2);

        for (int num : sumArray) {
            System.out.print(num + " ");
        }

    }

    /**
     * Adds one to the int represented by the source array
     */


    public static int[] addOne(int[] arr) {
        int[] arrOut;
        int carry = 1;
        int currentSum = 0;

        if (arr == null) {
            throw new IllegalArgumentException("arr is null");
        }
        arrOut = new int[arr.length + 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            currentSum = arr[i] + carry;
            arrOut[i + 1] = currentSum % 10;
            carry = currentSum / 10;
        }
        arrOut[0] = carry;
        return arrOut;

    }

    public static int[] addTwoInts(int[] arr1, int[] arr2) {
        int[] arrOut;
        int currentSum = 0;
        int carry = 0;

        if ((arr1 == null) || (arr2 == null) || (arr1.length != arr2.length)) {
            throw new IllegalArgumentException();
        }

        arrOut = new int[arr1.length + 1];
        for (int i = arr1.length - 1; i >= 0; i--) {
            currentSum = arr1[i] + arr2[i] + carry;
            arrOut[i + 1] = currentSum % 10;
            carry = currentSum / 10;
        }
        arrOut[0] = carry;
        return arrOut;

    }
}
