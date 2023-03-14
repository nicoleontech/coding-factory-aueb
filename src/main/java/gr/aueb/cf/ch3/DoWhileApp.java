package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει 1 μενου μέχρι ο χρήστης να επιλέξει exit
 * και ωποσδήποτε 1 φορά
 */
public class DoWhileApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;

        do{
            System.out.println("Επιλέξτε 1 απ τα παρακάτω");
            System.out.println("Εισαγωγή προιόντος");
            System.out.println("Διαγραφή προιόντος");
            System.out.println("Έξοδος από το μενού");

            choice = scanner.nextInt();

        }
        while (choice != 3);
    }
}
