package javafundamentals;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first character: ");
        char ch1 = scanner.next().charAt(0);

        System.out.print("Enter the second character: ");
        char ch2 = scanner.next().charAt(0);

        int d = ch1 - ch2;
        System.out.println("d = (" + (int)ch1 + " - " + (int)ch2 + ") = " + d);

        if (d > 0) {
            System.out.println("Second character is smaller");
        } else if (d < 0) {
            System.out.println("First character is smaller");
        } else {
            System.out.println("Both the characters are same");
        }

        scanner.close();
    }
}
