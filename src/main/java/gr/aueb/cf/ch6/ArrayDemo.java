package gr.aueb.cf.ch6;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] ages = {23, 45, 67, 31};

        //arr passes by value, but the items are passed by reference
        printArray(ages);

        printReverseArray(ages);
    }

    public static void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }
        for (int item : arr) {
            System.out.println(item);
        }
    }

    public static void printArray(int[] arr, int low, int high) {
        if (arr == null) return;
        if ((low < 0) || (high > arr.length - 1) || (high < low)) {
            return;
        }

        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printReverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
