package gr.aueb.cf.ch5;

public class FloatingPointApp {

    public static void main(String[] args) {
        System.out.printf("Type: %s, Size %d, Min: %e, Max: %e \n", Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Type: %s, Size %d, Min: %.2e, Max: %e \n", Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
    }
}
