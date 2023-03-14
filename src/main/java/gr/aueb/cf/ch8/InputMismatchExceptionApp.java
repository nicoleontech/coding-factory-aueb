package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * unchecked exception
 */
public class InputMismatchExceptionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        final int MAGIC = 12;

        while (true) {
            try {
                System.out.println("Please insert an int");
                inputNum = scanner.nextInt();
                if (inputNum == MAGIC) break;
                System.out.println("Input num= " + inputNum);
            } catch (InputMismatchException ex) {
                ex.printStackTrace();
                System.out.println("Please insert a valid int");
                scanner.nextLine(); // για να καταναλωθεί το λάθος
            }
        }
    }
}
