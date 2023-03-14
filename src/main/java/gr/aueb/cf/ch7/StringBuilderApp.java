package gr.aueb.cf.ch7;

/**
 * Σε όλες τις περιπτώσεις που έχουμε String concatenation
 * καλύτερα να χρησιμοποιούμε StringBuilder.
 * Εδώ μετράμε το performance κάνοντας benchmark test!
 */
public class StringBuilderApp {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String concatResult = "";
        long timeStart = 0L;
        long timeEnd = 0L;

        double stringElapsedTime = 0.0;
        double stringBuilderElapsedTime = 0.0;

        //Μετράμε χρόνο για το concat
        timeStart = System.currentTimeMillis();

        for (int i = 1; i <= 15000; i++) {
            concatResult = concatResult + i; //αφού το concatResult είναι String, το i γίνεται String
        }

        timeEnd = System.currentTimeMillis();
        stringElapsedTime = (timeEnd - timeStart) / 1000;


        //Για το StringBuilder
        timeStart = System.currentTimeMillis();

        for (int i = 1; i <= 15000; i++) {
            stringBuilder.append(i);
        }

        timeEnd = System.currentTimeMillis();
        stringBuilderElapsedTime = (timeEnd - timeStart) / 1000;

        System.out.println("String concat time " + stringElapsedTime +" seconds.");
        System.out.println("StringBuilder concat time " + stringBuilderElapsedTime + " seconds.");
    }
}
