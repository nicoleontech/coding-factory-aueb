package gr.aueb.cf.ch3;

import java.util.Scanner;

public class DigitsSumApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNum = 0;
        int num = 0;
        int sum = 0;
        int digitsCount = 0;
        int digit = 0;

        System.out.println("Please insert a number");

        inputNum = scanner.nextInt();
        num = inputNum;

        do {
            digit = num % 10;
            digitsCount++;
            sum += digit;
            num = num / 10;
        } while (num != 0);

        System.out.println("The total sum of the digits are " + sum +" and the total count of digits is "+digitsCount);
    }
}
