/**
 * What the program does it asks the user to enter a non-negative integers. 
 * After that it will print out in reverse order. It exits the program if the user inputs at -1.
 * @author Daniel Kim
 */
package assg1_kimj19;

import java.util.Scanner;

public class DigitReverse {

	public static void main(String[] args) {
		
		int number = 0;

		Scanner scan = new Scanner(System.in);
		while (number != -1) {// this while loop asks the user to input integers.
			System.out.print("Please enter a non-negative integer (-1 to exit): ");

			number = scan.nextInt();// Prints the number that the user inputed backwards.
			if (number != -1) {
				System.out.println("Your number printed in reverse order is:");
				digitExtract(number);
			}
		}
	}

	
	/**
	 * This reverses a number
	 * @param number - number to reverse
	 */
	public static void digitExtract(int number) {
		// if user prints just the number 0 it makes it able to print out 0
		if (number == 0) { 
			System.out.println(0);
		}
		while (number != 0) { // calculates the number the user inputs using the form of mod.
			int remainder = number % 10;
			System.out.println(remainder);
			number /= 10;
		}
	}

}
