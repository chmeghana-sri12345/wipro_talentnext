package javafundamentals;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Question17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number: ");
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }

        int sum = 0;
        int temp = Math.abs(number);

        while (temp > 0) {
            sum += temp % 10;
            temp = temp / 10;
        }

        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}
