package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterApp {

    public static void main(String[] args) {
        try (PrintWriter printWriter = new PrintWriter("C:/temp/pw.txt")) {
            printWriter.println("Hello Cf");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
