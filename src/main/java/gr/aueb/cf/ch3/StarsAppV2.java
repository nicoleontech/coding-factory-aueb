package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει πόσα * θα εκτυπωθούν
 */
public class StarsAppV2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int i = 1;

        System.out.println("Please insert number of stars");
        n = scanner.nextInt();

        while (i <= n){
            System.out.print("*");
            i++;
        }

        System.out.println();
    }
}
