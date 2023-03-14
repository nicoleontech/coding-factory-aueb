package gr.aueb.cf.ch8;
/**
 * όταν ένα resource είναι autocloseable όπως εδώ ο scanner, κάνουμε try with Resources
 * Αλλιώς πρέπει να κάνω finally.
 * Στην try with resources, θεωρούμε τα resources final or effectively final
 * άρα δεν επιτρέπεται να αλλάξουν μετά στο try block
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {

    public static void main(String[] args) {

        int num = 0;
        Scanner scanner = new Scanner(System.in);

        try ( scanner) {
            num = scanner.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            e.printStackTrace();
      }
//        finally {
//            try {
//                scanner.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        }

        System.out.println("It's not always executed");
    }
}
