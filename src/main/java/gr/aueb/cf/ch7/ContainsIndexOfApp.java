package gr.aueb.cf.ch7;

import java.util.Scanner;

public class ContainsIndexOfApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        int index = 0;

        System.out.println("Please insert a string");
        s = scanner.nextLine();

        if (s.contains("Athens")) {
            index = s.indexOf("Athens");
            System.out.println("Bingo");
        } else {
            index = s.indexOf("Athens");
            System.out.println("Atens not found. Index " + index);
        }

        System.out.println("Total string length " + s.length());
    }
}
