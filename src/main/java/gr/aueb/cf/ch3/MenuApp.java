package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζεται επαναληπτικά ένα μενού μέχρι ο χρήστης να επιλέξει 5 για έξοδο.
 */

public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1.Εισαγωγή");
            System.out.println("2.Διαγραφή");
            System.out.println("3.Ενημέρωση");
            System.out.println("4.Αναζήτηση");
            System.out.println("5.Έξοδος");
            choice = scanner.nextInt();
        }
        while (choice != 5);
    }

}
