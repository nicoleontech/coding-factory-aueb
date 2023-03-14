package gr.aueb.cf.ch2;

import java.util.Scanner;

/*
Διαβάζει από τον χρήστη μία θερμοκρασία σε Fahrenheit και την μετατρέπει σε βαθμούς Κελσίου.
 */
public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        System.out.println("Please give a temperature in Fahrenheit!");
        fahrenheit = scanner.nextInt();
        celsius = 5 * (fahrenheit -32) /9;

        System.out.printf("%d fahrenheit degrees are %d celsius degrees", fahrenheit,celsius);


    }
}