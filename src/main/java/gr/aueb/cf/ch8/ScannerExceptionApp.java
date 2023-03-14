package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExceptionApp {

    public static void main(String[] args) {
        //try with resources
        try (Scanner scanner = getFileDescriptor("C:/tmp/random.txt")) {
            String s = scanner.nextLine();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Scanner getFileDescriptor(String file) throws FileNotFoundException {
        File fd = new File(file);
        try {
            return new Scanner(fd);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
