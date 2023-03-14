package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Διαβάζει String και μετατρέπει σε Integer
 */
public class TypecastApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lexeme = "";
        int num = 0;

        System.out.println("Please insert a string");
        lexeme += scanner.next();

        num = Integer.parseInt(lexeme);
        System.out.println("Num= " + num);
    }
}
