package make_change;

import java.util.Scanner;

public class MakeChange {
	public static void main(String args[]) {
		// declare scanner
		Scanner scn = new Scanner(System.in);
		
		// get price
		System.out.print("Enter price in dollars: ");
		int dollarsCost = scn.nextInt();
		System.out.print("Enter price in cents: ");
		int centsCost = scn.nextInt();
		
		// get money received
		System.out.print("Enter money received in dollars: ");
		int dollarsReceived = scn.nextInt();
		System.out.print("Enter money received in cents: ");
		int centsReceived = scn.nextInt();
		
		// Calculate change
		int dollarsChange;
		int centsChange;
		if(centsReceived == 0) {
			dollarsChange = dollarsReceived - dollarsCost - 1;
			centsChange = 100 - centsCost;
		} else {
			dollarsChange = dollarsReceived - dollarsCost;
			centsChange = centsReceived - centsCost;
		}
		
		// Return
		System.out.println("Change returned:");
		System.out.printf("%d dollar(s)\n", dollarsChange);
		System.out.printf("%d quarter(s)\n", centsChange / 25);
		centsChange = centsChange % 25;
		System.out.printf("%d dime(s)\n", centsChange / 10);
		centsChange = centsChange % 10;		
		System.out.printf("%d nickle(s)\n", centsChange / 5);
		centsChange = centsChange % 5;
		System.out.printf("%d pennies\n", centsChange);
		
		// Close scanner
		scn.close();	
	}
}
