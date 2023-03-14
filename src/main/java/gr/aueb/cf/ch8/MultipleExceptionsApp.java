package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Αν θέλω να κάνω catch multiple exceptions,
 * πάω από το πιο ειδικό στο γενικό
 */
public class MultipleExceptionsApp {

    public static void main(String[] args) {
        File file = new File("C:\\tmp\\random.txt");

        try(Scanner scanner = new Scanner(file)){
          int ch = System.in.read();
          int num = scanner.nextInt();
        } catch (FileNotFoundException ex1){
            ex1.printStackTrace();
        } catch (IOException ex2){
            ex2.printStackTrace();
        } catch (Exception ex3) {
            ex3.printStackTrace();
        }
    }
}
