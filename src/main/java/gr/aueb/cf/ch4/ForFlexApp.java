package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει την αρχική τιμή, την τελική τιμή και το βήμα
 * αύξησης ή μείωσης και εκτυπώνει το i και το πλήθος
 * των επαναλήψεων
 */
public class ForFlexApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startValue = 0;
        int endValue = 0;
        int step = 0;
        int iterations = 0;

        System.out.println("Please insert start, end and step");
        startValue = scanner.nextInt();
        endValue = scanner.nextInt();
        step = scanner.nextInt();

        for (int i = startValue; i <= endValue; i = i + step) {
            System.out.println(i + " ");
            iterations++;
        }

        System.out.println("iterations" + iterations);


    }
}
