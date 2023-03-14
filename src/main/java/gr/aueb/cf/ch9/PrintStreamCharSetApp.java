package gr.aueb.cf.ch9;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * PrintStream με charset
 */

public class PrintStreamCharSetApp {

    public static void main(String[] args) {
        try (PrintStream printStream = new PrintStream("C:/temp/file1.txt", StandardCharsets.UTF_8);
             PrintWriter printWriter = new PrintWriter("C:/temp/file2.txt", "UTF-8")) {
            printStream.println("Hey");
            printWriter.println("Καλησπέρα");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
