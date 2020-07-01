package gas_mileage;

import java.util.Scanner;

public class Application {
	
	static double calculateMPG(int miles, double gallons) {
		return miles / gallons;
	}
	
	public static void main(String args[]) {
		// Declare Scanner
		Scanner scn = new Scanner(System.in);
		
		// Get input from user
		System.out.println("Enter number of gallons consumed: ");
		double gallons = scn.nextDouble();
		System.out.println("Enter number of miles traveled: ");
		int miles = scn.nextInt();
		
		// Print result
		System.out.printf("Miles per gallon: %.2f", calculateMPG(miles, gallons));
		
		// Close scanner
		scn.close();
	}
}
