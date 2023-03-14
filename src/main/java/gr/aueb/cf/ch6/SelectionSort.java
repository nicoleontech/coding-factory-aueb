package gr.aueb.cf.ch6;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {7, 4, 9, 3, 10};

        selectionSort(arr);
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        int min = 0;
        int minPosition = 0;


        for (int i = 0; i < arr.length; i++) {

            minPosition = i;
            min = arr[minPosition];

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    minPosition = j;
                    min = arr[j];
                }
            }

            //Swap
            swap(arr, i, minPosition);
        }
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.println(item);
        }
    }
}
