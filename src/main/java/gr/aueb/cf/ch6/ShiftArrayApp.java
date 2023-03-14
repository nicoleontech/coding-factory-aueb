package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ShiftArrayApp {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        // shiftArrayByOne(arr);
        printArray(shiftArrayByOne(arr));

        printArray(shiftArrayByOne(arr, 1));
        printArray(shift(new int[]{1, 2, 3, 4}, 2));
    }

    public static int[] shiftArrayByOne(int[] arr) {
        if (arr == null) return null;

        int[] shifted = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {

            shifted[i] = arr[i + 1];
        }
        return shifted;
    }

    public static int[] shiftArrayByOne(int[] arr, int low) {
        if (arr == null) return null;

        if ((low < 0) || (low > arr.length - 1)) return null;

        int[] shifted = Arrays.copyOf(arr, arr.length);
        for (int i = low; i < arr.length - 1; i++) {
            shifted[i] = arr[i + 1];
        }
        shifted[shifted.length - 1] = 0;
        return shifted;
    }

    /**
     * eg shift the arr 2 positions [1,2,3,4]
     *
     * @return [3, 4, 0, 0]
     */
    public static int[] shift(int[] arr, int shift) {
        if (arr == null) return null;
        int[] shifted = new int[arr.length];
//        for (int i = shift; i < arr.length - shift; i++) {
//            shifted[i] = arr[shift];
//        }
//        return shifted;

        if (shift > arr.length) {
            return shifted;
        }
        shifted = Arrays.copyOfRange(arr, shift, arr.length + shift); //+shift in the end to pad with 0
        return shifted;
    }


    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
