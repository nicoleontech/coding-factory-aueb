package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης μαντεύει 1 αριθμό κι αν τον βρει σωστά κάνει bingo
 */
public class BingoApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int Key = 10;
        int inputNum = 0;
        boolean bingo = false;

        do{
            System.out.println("Please insert your guess number");
            inputNum = scanner.nextInt();
            if (inputNum == Key) {
                System.out.println("Bingo");
                bingo = true;
            } else {
                System.out.println("Try again");
            }
        } while (!bingo);
    }
}
