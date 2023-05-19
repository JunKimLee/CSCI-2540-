/**
 * @author Daniel Kim
 * What the class does it asks user to test out either the 2 parameter or three parameter String methods. Gives you the option for 1 to test the two
 * parameter, 2 to test 3 parameter and 3 to exit out of the program.
 */
package assg5_kimj19;
import java.util.*;
public class RecursionTest {
/*
 * Calling scanner to get user inputs and put variables for userInput, userStart, userEnd and testing.
 */
	public static void main (String[]args) {
		Scanner Keyboard = new Scanner(System.in);
		int Testing = 0;
		String userInput;
		int userStart = 0;
		int userEnd = 0;
		do {
			System.out.println("Enter 1:Test two-parameter substringRecursive method ");
			System.out.println("Enter 2: Test three-parameter substringRecursive method ");
			System.out.println("Enter 3: Exit");

// case statements to give the user the option for either option 1 ,  2 , 3 to test out parameters or exiting out of the program.
			Testing= Keyboard.nextInt();
			Keyboard.nextLine();
			switch(Testing) {
			case 1:// Testing the two parameter it asks for the user to to put a number for String and prints the rest after that number. Like
				   // for example "Hello" String and userStart clicks 1 prints ello sorry I couldnt really explain that.
				System.out.println("\nEnter a String ");
				
				userInput= Keyboard.nextLine();
				System.out.println("Enter a index");
				userStart = Keyboard.nextInt();
				System.out.println(subStringRecursive(userInput, userStart));

				break;
			case 2: //Testing the 3 parameter It ask fro the String message user inputs the number indicating where it wants to start and end
				System.out.println("\nEnter a String ");
				
				userInput= Keyboard.nextLine();
				System.out.println("Enter beggining index");
				userStart = Keyboard.nextInt();
				System.out.println("Enter the ending index");
				userEnd = Keyboard.nextInt();
				System.out.println(subStringRecursive(userInput, userStart, userEnd));
				break;
			case 3:
				Keyboard.close();
				break;
			}
		} 
		while(Testing != 3);
	}
/**
 * 
 * @param userInput
 * @param userStart
 * @return
 */
	public static String subStringRecursive(String userInput, int userStart) {

		if (userInput.length() == userStart) {
			return "";
		}
		else {
			return userInput.charAt(userStart) + subStringRecursive(userInput, userStart + 1);

		}
	}
	/**
	 * 
	 * @param o
	 * @param userStart setting it equal to userEnd to print out a String
	 * @param userEnd
	 * @return returns the character of UserStart(beggining of String) + cause is recursion is calling itself as a String 
	 * userStart +1 ( to make the word go to the right), till the userEnd input.
	 * 
	 */
	public static String subStringRecursive  (String userInput, int userStart, int userEnd) {
		if (userStart == userEnd) { //Hello
			return "";

		}
		else {
			return userInput.charAt(userStart) + subStringRecursive (userInput, userStart+1, userEnd); 
		}

	}


}


