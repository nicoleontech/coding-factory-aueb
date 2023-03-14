package gr.aueb.cf.ch8;

import java.util.Scanner;

public class InputMismatchException2App {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        final int MAGIC = 12;

        while (true) {

            System.out.println("Please insert an int");

            //hasNextInt method pou elegxei to state
            if (scanner.hasNextInt()) {
                inputNum = scanner.nextInt();
            } else {
                System.out.println("Please insert a valid int");
                scanner.nextLine();
                continue;
            }
            if (inputNum == MAGIC) break;
            System.out.println("Input num= " + inputNum);
        }
    }

}
