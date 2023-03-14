package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NestedIfApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int modulesCount = 0;
        int totalMarks = 0;
        int avg = 0;


        System.out.println("Please insert the sum of grades");
        totalMarks = scanner.nextInt();

        System.out.println("Please insert modules count");
        modulesCount = scanner.nextInt();

        if (modulesCount != 0) {
            avg = totalMarks / modulesCount;

            if ((avg >= 9) && (avg <= 10)) {
                System.out.println("Excellent");
            } else if ((avg >= 0) && (avg <= 4)) {
                System.out.println("Fail");
            }

        } else {
            System.out.println("Modules count can't be zero");
        }
    }


}
