package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Finds max between 2 inputs
 */
public class MaxApp {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        Scanner scanner = new Scanner(System.in);
        int max = 0;

        System.out.println("Insert 2 numbers");

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

//        if(num1 <num2){
//            max = num1;
//        } else {
//            max = num2;
//        }

        //Same but with ternary operator
        max = (num1 > num2) ? num1 : num2;

        System.out.printf("The min value between %d and %d is %d", num1, num2, max);

    }
}
