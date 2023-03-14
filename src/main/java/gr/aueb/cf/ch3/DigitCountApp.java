package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων ενός ακεραίου
 * μέχρι το αποτέλεσμα της διαίρεσης, το υπόλοιπο, να μην είναι 0
 */
public class DigitCountApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNum = 0;
        int num = 0;
        int digitsCount = 0;

        System.out.println("Please insert a number");

        inputNum = scanner.nextInt();
        num = inputNum;

        do {
            digitsCount++;
            num = num / 10;
        } while (inputNum != 0);

        System.out.println("The total digits are " + digitsCount);
    }
}
