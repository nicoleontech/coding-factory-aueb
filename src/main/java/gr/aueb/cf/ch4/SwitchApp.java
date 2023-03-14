package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please select one of the following");
            System.out.println("1. 1-player game");
            System.out.println("2. 2-player game");
            System.out.println("3. Team game");
            System.out.println("4. Exit game");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Start one-player game");
                    break;
                case 2:
                    System.out.println("Start two-player game");
                    break;
                case 3:
                    System.out.println("Start team-player game");
                    break;
                case 4:
                    System.out.println("Exiting game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while (choice != 4);
    }
}
