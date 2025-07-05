package javafundamentals;

public class Question16 {
    public static void main(String[] args) {
        for (int number = 10; number <= 99; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        int limit = (int) Math.sqrt(num);
        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
