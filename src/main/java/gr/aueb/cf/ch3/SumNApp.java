package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει από τον χρήστη 1 ακέραιο και βρίσκει το άθροισμα από 1 έως Ν.
 * 1 + 2 + ...+ N
 */
public class SumNApp {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert a number");

        num = scanner.nextInt();

        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println("Sum = "+sum);
    }
}
