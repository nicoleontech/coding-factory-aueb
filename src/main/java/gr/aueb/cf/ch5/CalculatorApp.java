package gr.aueb.cf.ch5;

import java.util.Scanner;

public class CalculatorApp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        do {
            printMenu();
            choice = getUserChoice();

            if ((choice >= 1) && (choice <= 5)) {
                System.out.println("Please insert 2 numbers");
                num1 = getOneNumber();
                num2 = getOneNumber();
            }
            result = getResult(choice, num1, num2);
            System.out.println("Result= " + result);
        } while (choice != 6);
        System.out.println("Thank you for using calculator app!");
    }

    public static void printMenu() {
        System.out.println("Επιλέξατε ένα από τα παρακάτω");
        System.out.println("1.Πρόσθεση");
        System.out.println("2.Αφαίρεση");
        System.out.println("3.Πολλαπλασιασμός");
        System.out.println("4.Διαίρεση");
        System.out.println("5.Υπόλοιπο Διαίρεσης");
        System.out.println("6.Έξοδος");
    }

    public static int getUserChoice() {
        return scanner.nextInt();
    }

    public static int getOneNumber() {
        return scanner.nextInt();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b != 0) {
            return a / b;
        }
        System.out.println("Error divide by 0");
        return 0;
    }

    public static int mod(int a, int b) {
        if (b != 0) {
            return a % b;
        }
        System.out.println("Error mod by 0");
        return 0;
    }

    public static int getResult(int choice, int num1, int num2) {
        int result = 0;
        switch (choice) {
            case 1:
                result = add(num1, num2); //invocation
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            case 6:
                System.out.println("Επιλέξατε έξοδο");
                break;
            default:
                System.out.println("Λάθος επιλογή");
                break;
        }
        return result;
    }

}
