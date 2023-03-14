package gr.aueb.cf.ch6;

public class SwapDemo {

    public static void main(String[] args) {

        int[] arr = {2, 10};
        printArray(arr);

        swap(arr);
        printArray(arr);
    }

    public static void swap(int[] arr) {
        if (arr.length != 2) return;
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

    }


    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
