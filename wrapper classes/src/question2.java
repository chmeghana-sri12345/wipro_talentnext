import java.util.*;

public class question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        if (n >= 1 && n <= 255) {
            String s = Integer.toBinaryString(n);
            String ans = String.format("%8s", s).replace(' ', '0');
            System.out.println("8-bit Binary: " + ans);
        } else {
            System.out.println("Enter the number between 1 and 255 (inclusive).");
        }

        sc.close(); // optional but good practice
    }
}
