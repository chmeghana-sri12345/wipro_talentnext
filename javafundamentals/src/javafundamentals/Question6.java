package javafundamentals;

import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		if(num %2 == 0) {
			System.out.println("The number is Even.");
		}else {
			System.out.println("The number is Odd.");
		}
	}

}