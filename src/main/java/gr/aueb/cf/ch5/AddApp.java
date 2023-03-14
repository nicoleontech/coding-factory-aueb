package gr.aueb.cf.ch5;

/**
 * Υπολογίζει το άθροισμα 2 ακεραίων με την χρήση της μεθόδου add.
 */
public class AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = add(a, b);
        System.out.println("sum= " + sum);
    }

    public static int add(int a, int b) {
//        int sum = 0;
//        sum = a + b;
//        return sum;
        return a + b;
    }
}
