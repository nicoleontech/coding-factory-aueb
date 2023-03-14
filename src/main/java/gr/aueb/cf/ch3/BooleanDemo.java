package gr.aueb.cf.ch3;


import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει με βάση 2 μεταβλητές
 * αν βρέχει και αν η θερμοκρασία <0
 */
public class BooleanDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRaining = false;
        int temperature = 0;
        boolean isSnowing = false;

        System.out.println("Please insert if it is raining");
        isRaining = scanner.nextBoolean();

        System.out.println("Please insert temperature");
        temperature = scanner.nextInt();

        //short circuit, if isRaining is false, it doesn't examine the 2nd part
        isSnowing = isRaining && (temperature< 0 );

        System.out.println("isSnowing "+isSnowing);

    }
}
