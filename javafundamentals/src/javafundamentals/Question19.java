package javafundamentals;
import java.util.Scanner;

public class Question19 {
    public static int reverse(int x) {
        long input = x;
        boolean isNeg = input < 0;
        if (isNeg) input = -input;

        long rev = 0;
        while (input != 0) {
            rev = rev * 10 + (input % 10);
            input /= 10;
        }
        if (rev > Integer.MAX_VALUE) return 0;  // Overflow case
        return isNeg ? -(int)rev : (int)rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversed = reverse(number);
        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}
