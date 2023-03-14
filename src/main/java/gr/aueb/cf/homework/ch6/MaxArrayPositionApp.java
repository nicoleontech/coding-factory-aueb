package gr.aueb.cf.homework.ch6;

public class MaxArrayPositionApp {

    public static void main(String[] args) {
        int[] arr = {10, 2, 70, 32, 14, 5};
        int maxPosition = getMaxPosition(arr, 0, arr.length - 1);
        System.out.println("The position of maximum element is: " + maxPosition);
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = low;
        int maxElement = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}
