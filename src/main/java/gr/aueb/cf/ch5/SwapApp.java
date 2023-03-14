package gr.aueb.cf.ch5;

public class SwapApp {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        swap(a, b);
        System.out.println("a= " + a + " b= " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a= " + a + " b= " + b);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }
}
