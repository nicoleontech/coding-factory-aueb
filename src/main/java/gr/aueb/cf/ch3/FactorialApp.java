package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρίσκει το n! (ν παραγοντικό)
 * 1 *2 *3 * ...*n
 * όπου 0! = 1
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int factorial = 1;
        int i = 1;

        System.out.println("Please insert n");
        n = scanner.nextInt();

        while (i <=n){
            factorial *=i;
            i++;
        }

        System.out.println("Factorial = "+factorial);
    }
}
