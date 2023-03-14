package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Επιτυχής εισαγωγή");
                    break;
                case 2:
                    System.out.println("Επιτυχής διαγραφή");
                    break;
                case 3:
                    System.out.println("Επιτυχής ενημέρωση");
                    break;
                case 4:
                    System.out.println("Επιτυχής αναζήτηση");
                    break;
                case 5:
                    System.out.println("Επιτυχής έξοδος");
                    break;
                default:
                    System.out.println("Λάθος επιλογή");
                    break;

            }
        }
        while (choice != 5);
    }

    /**
     * Prints a crud menu
     */
    public static void printMenu() {
        System.out.println("Επιλέξατε ένα από τα παρακάτω");
        System.out.println("1.Εισαγωγή");
        System.out.println("2.Διαγραφή");
        System.out.println("3.Ενημέρωση");
        System.out.println("4.Αναζήτηση");
        System.out.println("5.Έξοδος");
    }
}
