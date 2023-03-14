package gr.aueb.cf.ch6;

import java.util.Arrays;


public class GetLowAndHighIndexApp {


    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int[] result = getLowAndHighIndexOf(arr, 8);
        System.out.println("The low and high index of 8 in the array is: "
                + Arrays.toString(result));
    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {

        if (arr == null) {
            throw new IllegalArgumentException();
        }
        int[] arrOfIndices = new int[2];
        boolean keyIsFound = false;
        while (!keyIsFound) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    arrOfIndices[0] = i;
                    keyIsFound = true;
                    for (int j = arrOfIndices[0]; j < arr.length; j++) {
                        if (arr[j] == key) {
                            arrOfIndices[1] = j;
                        }
                    }
                    break;
                }
            }
        }
        return arrOfIndices;
    }

}

