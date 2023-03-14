package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamApp {

    public static void main(String[] args) {
        try (PrintStream printStream = new PrintStream("C:/temp/f1.txt")) {
            printStream.println("Hello CF");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
