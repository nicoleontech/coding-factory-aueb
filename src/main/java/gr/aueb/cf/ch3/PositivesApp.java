package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει ακεραίους μέχρι να βρει αρνητικό, οπότε σταματάει
 * και μετράει το πλήθος των θετικών
 */
public class PositivesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.println("Please give a positive int or negative for exit");

        num = scanner.nextInt();

        while (num >=0){
            System.out.println("1 positive number inserted");
            positivesCount++;
            System.out.println("Insert a new positive");
            num = scanner.nextInt();
        }

        System.out.println("Total number of positive numbers "+positivesCount);
    }
}
