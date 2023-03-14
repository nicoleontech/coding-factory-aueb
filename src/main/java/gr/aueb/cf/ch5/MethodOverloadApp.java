package gr.aueb.cf.ch5;

/**
 * Method overloading, meaning methods with the same name but different parameters!
 */
public class MethodOverloadApp {

    public static void main(String[] args) {

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
