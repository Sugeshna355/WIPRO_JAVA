package Controlflow;

import java.util.Scanner;

public class Oddoreven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num= scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.print(num+ " is even number");
	} else {
		System.out.print(num+ " is odd number" );
	}
	scanner.close();

}
}
