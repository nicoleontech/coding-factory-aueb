package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Μετατρέπει μέρες, ώρες, λεπτά και δευτερόλεπτα σε δευτρόλεπτα
 */
public class DHMSToSecondsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Gia na apofygw to typecast mporw na kanw kai ta final fields Long
        final int SEC_PER_DAY = 24 * 3600;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MIN = 60;

        long totalSeconds = 0L;
        long inputDays = 0L;
        long inputHours = 0L;
        long inputMinutes = 0L;
        long inputSeconds = 0L;

        System.out.println("Please insert days, min, hours, secs");
        inputDays = scanner.nextLong();
        inputHours = scanner.nextLong();
        inputMinutes = scanner.nextLong();
        inputSeconds = scanner.nextLong();

        totalSeconds = (inputDays * SEC_PER_DAY) + (inputHours * SEC_PER_HOUR)
                + (inputMinutes * SEC_PER_MIN) + inputSeconds;

        System.out.printf(Locale.US,"Total seconds : %,d",totalSeconds);
    }
}