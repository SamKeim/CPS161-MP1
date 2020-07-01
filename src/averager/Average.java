package averager;

import java.util.Scanner;

public class Average {
	static double calculateAverage(int a, int b, int c) {
		return (a + b + c) / 3;
	}
	public static void main(String args[]) {
		// Declare Scanner
		Scanner scn = new Scanner(System.in);
		
		// Get input from user
		System.out.println("Please enter three numbers, space separated: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		// Return to user
		System.out.printf("Your numbers are %d, %d, and %d\n", a, b, c);
		System.out.printf("The average of these numbers is %.2f", calculateAverage(a, b, c));
		
		// Close scanner
		scn.close();
	}
}
