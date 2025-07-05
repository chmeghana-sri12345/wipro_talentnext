package javafundamentals;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        int month = 0;
        while (true) {
            System.out.print("Enter the month number (1-12): ");
            if (scanner.hasNextInt()) {
                month = scanner.nextInt();
                if (month >= 1 && month <= 12) {
                    System.out.println(months[month - 1]);
                    break;
                } else {
                    System.out.println("Invalid month. Please enter a number between 1 and 12.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
