package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ελέγχει αν 1 ακέραιος που δίνει ο χρήστης είναι ζυγός / άρτιος
 */
public class EvenApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean isEven = false;

        System.out.println("Please insert a number");
        num = scanner.nextInt(); //Διαβάζει tokens μέχρι να δει white space κενό, αλλαγή γραμμής ή tab

        isEven = (num % 2) ==0;

        System.out.println(num + " is even?? "+isEven);


    }
}
