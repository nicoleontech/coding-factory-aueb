package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Υπολογίζει a^b
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 1;

        System.out.println("Please insert a,b");
        a = scanner.nextInt();
        b = scanner.nextInt();

        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        System.out.printf("%d ^ %d = %d", a, b, result);
    }
}
