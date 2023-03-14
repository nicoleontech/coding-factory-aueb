package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Μέθοδος που γράφει σε αρχείο και στην κονσόλα
 */
public class PrintStreamMethodApp {

    public static void main(String[] args) {

        try (PrintStream printStream = new PrintStream("C:/temp/cf.txt")) {
            printMessage(printStream, "Hey y'all");
            printMessage(System.out, "Goodbye");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void printMessage(PrintStream printStream, String msg) {
        printStream.println(msg);
    }

}
