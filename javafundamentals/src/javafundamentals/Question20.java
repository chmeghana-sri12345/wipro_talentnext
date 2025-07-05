package javafundamentals;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;

        // Handle negative input
        if (number < 0) {
            System.out.println(original + " is not a palindrome");
            scanner.close();
            return;
        }

        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }

        scanner.close();
    }
}
