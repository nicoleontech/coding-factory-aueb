package gr.aueb.cf.homework.ch6;

public class SecondMinArrayApp {

    public static void main(String[] args) {
        int[] arr = {10, 2, 70, 32, 14, 5};
        int secondMinElement = getSecondMinElem(arr);
        System.out.println("Second min element of the array is: " + secondMinElement);
    }

    public static int getSecondMinElem(int[] arr) {
        int min = arr[0];
        int secondMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] > min) {
                        secondMin = arr[j];
                    }
                }

            }
        }
        return secondMin;
    }
}
