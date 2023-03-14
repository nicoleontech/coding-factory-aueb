package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * while-do-break
 */
public class Bingo2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int KEY = 10;
        int num = 0;
        boolean isFound = false;

        while (true) {
            System.out.println("Please insert a guess number");
            num = scanner.nextInt();

            if (num == KEY) {
                isFound = true;
                break;
            } else {
                System.out.println("Please try again");
            }
        }
        //redundant statement
        if (isFound) {
            System.out.println("Congratulations");
        }


    }
}
