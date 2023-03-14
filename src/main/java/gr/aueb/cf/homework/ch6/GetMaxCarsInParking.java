package gr.aueb.cf.homework.ch6;

public class GetMaxCarsInParking {

    public static void main(String[] args) {
        int[][] carsInParking = {
                {1012, 1136},
                {1317, 1417},
                {1015, 1020}
        };
        int max = getMaxCarsInParking(carsInParking);
        System.out.println("Max number of cars in the parking at the same time" +
                "is: " + max);
    }

    public static int getMaxCarsInParking(int[][] arr) {
        if(arr == null){
            throw new IllegalArgumentException();
        }
        return 0;
    }
}
