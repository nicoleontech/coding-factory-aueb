package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει τον μικρότερο ή ισο 2 ακεραίων
 */
public class MinApp {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        Scanner scanner = new Scanner(System.in);
        int min = 0;

        System.out.println("Insert 2 numbers");

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

//        if(num1 <num2){
//            min = num1;
//        } else {
//            min = num2;
//        }

        //Same but with ternary operator
        min = (num1 < num2) ? num1 : num2;

        System.out.printf("The min value between %d and %d is %d", num1, num2, min);

    }
}
