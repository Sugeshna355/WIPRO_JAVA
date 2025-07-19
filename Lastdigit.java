package Controlflow;

import java.util.Scanner;

public class Lastdigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first non-negative integer: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second non-negative integer: ");
		int num2 = scanner.nextInt();
		if (num1 <0 || num2 < 0) {
			System.out.println("Both numbers must be non-negative.");
		} else {
			int lastDigit1 = num1 % 10;
			int lastDigit2 = num2 % 10;
			
			boolean sameLastDigit = (lastDigit1 == lastDigit2);
			System.out.println(sameLastDigit);
		}
		scanner.close();
	}

}
