package rvt;

import java.util.Scanner;

public class DivisionPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the numerator: ");
            String numLine = scanner.nextLine();

            if (numLine.length() > 0) {
                char first = numLine.charAt(0);
                if (first == 'q' || first == 'Q') {
                    break;
                }
            }

            int numerator;
            try {
                numerator = Integer.parseInt(numLine.trim());
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
                System.out.println();
                continue;
            }

            System.out.print("Enter the divisor: ");
            String divLine = scanner.nextLine();

            int divisor;
            try {
                divisor = Integer.parseInt(divLine.trim());
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
                System.out.println();
                continue;
            }

            if (divisor == 0) {
                System.out.println("You can't divide " + numerator + " by 0");
                System.out.println();
                continue;
            }

            int result = numerator / divisor;
            System.out.println(numerator + " / " + divisor + " is " + result);
            System.out.println();
        }

        scanner.close();
    }
}
