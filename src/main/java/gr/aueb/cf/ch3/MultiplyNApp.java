package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει 1 * 2 *3 *...n
 * όπου n είναι ένας ακέραιος που δίνει ο χρήστης
 */
public class MultiplyNApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;
        int result = 1;

        System.out.println("Please insert an integer number");

        num =scanner.nextInt();

        while (i <= num){
            result *= i;
            i++;
        }
        System.out.println("Το γινόμενο είναι "+result);
    }
}
