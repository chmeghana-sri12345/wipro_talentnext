import java.util.*;

public class question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        System.out.println("Given number: " + n);
        System.out.println("Binary equivalent: " + Integer.toBinaryString(n));
        System.out.println("Octal equivalent: " + Integer.toOctalString(n));
        System.out.println("Hexadecimal equivalent: " + Integer.toHexString(n));

        sc.close();
    }
}
