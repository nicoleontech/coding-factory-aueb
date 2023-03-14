package gr.aueb.cf.ch5;

public class PowerApp {

    public static void main(String[] args) {

        System.out.println(pow(2, 3));
    }

    public static int pow(int a, int n) {
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power *= a;
        }
        return power;
    }
}
