package gr.aueb.cf.ch4;

import java.util.Scanner;

public class CharScannerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar = ' ';

        inputChar = scanner.nextLine().charAt(0);

        System.out.println("input char "+inputChar);
    }
}
