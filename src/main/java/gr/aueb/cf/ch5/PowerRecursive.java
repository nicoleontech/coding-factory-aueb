package gr.aueb.cf.ch5;

public class PowerRecursive {

    public static void main(String[] args) {
        int a = 2, n = 4;
        System.out.println(power(a, n));
    }

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * power(a, n - 1);
        }
    }
}
