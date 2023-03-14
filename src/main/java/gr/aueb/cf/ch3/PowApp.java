package gr.aueb.cf.ch3;

import java.util.Scanner;

public class PowApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 1;
        int i = 1;

        System.out.println("Please insert a,b");
        a = scanner.nextInt();
        b = scanner.nextInt();

        while (i <= b){
            result *= a;
            i++;

        }

        System.out.println("Result = "+result);
    }
}
