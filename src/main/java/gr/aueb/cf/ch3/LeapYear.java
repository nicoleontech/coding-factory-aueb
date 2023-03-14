package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Πρόγραμμα που υπολογίζει αν ένα έτος είναι δίσεκτο ή οχι.
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;

        System.out.println("Please enter a year!");
        year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("The year you entered is leap!");
        } else {
            System.out.println("The year you entered isn't a leap year");
        }
    }
}
