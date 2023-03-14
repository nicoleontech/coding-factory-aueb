package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ένα αεροσκάφος έχει 2 δεξαμενές, ο πιλότος δίνει true ή false
 * σε μία κονσόλα αν η μία δεξαμενή έχει μικρότερο από το 1/4 της χωρητικότητάς της καύσιμο
 * κ τότε ανάβει μία πορτοκαλί ένδειξη, ενώ αν δώσει 2 true, τότε ανάβει ένα κόκκινο σήμα
 */

public class OrangeRedSignalApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean orangeOn = false;
        boolean redOn = false;
        boolean isTank1LessThanOneQuarter = false;
        boolean isTank2LTOneQuarter = false;

        System.out.println("Please insert if tank1/tank2 are less than 1/4");
        isTank1LessThanOneQuarter = scanner.nextBoolean();
        isTank2LTOneQuarter = scanner.nextBoolean();

        orangeOn = isTank1LessThanOneQuarter || isTank2LTOneQuarter;
        redOn = isTank1LessThanOneQuarter && isTank2LTOneQuarter;

        System.out.println("orangeOn "+orangeOn);
        System.out.println("redOn "+redOn);


    }
}
