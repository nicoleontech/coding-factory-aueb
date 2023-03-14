package gr.aueb.cf.ch3;


import java.util.Scanner;

/**
 * Αποφασίζει αν θα ανάψουν τα φώτα του αυτοκινήτου με βάση 3 μεταβλητές
 * αν βρέχει και ταυτόχρονα ισχύει 1 τουλάχιστον απ τα επόμενα
 * είναι σκοτάδι ή τρέχουμε (speed > 100)
 */

public class LightsApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean lightsOn = false;

        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int velocity = 0;
        final int MIN_VELOCITY = 100;

        System.out.println("Please insert if it is raining, if it's dark and velocity");

        isRaining = scanner.nextBoolean();
        isDark = scanner.nextBoolean();
        velocity = scanner.nextInt();

        isRunning = velocity > MIN_VELOCITY;

        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("lightsOn " + lightsOn);


    }

}
