package assg9_kimj19;
import java.io.*;
import java.util.*;

import assg6_Kimj19.BookCatalog;
/**
 * this is the main method to test out everything that i have done 
 * in the phoneBook class to see if it works its going to test all the methods
 * on the phoneBook
 * @author danielkim
 *
 */
public class phonebookManager {

	public static void main(String[] args) {
		phoneBook b = new phoneBook(); // setting to new phoneBook
		String filename = "assg9_phoneBook.txt"; //getting the file assg9_phoneBook.txt that i have imported to eclipse
		int userInput = 0;
		String userAnswer = " ";
		int userMenu = 0;
		b.loadData(filename);
		
		Scanner kbd = new Scanner(System.in);
		String phoneNumber = null; //user entering the phonenumber 
		String name = null; // user entering the name
		String userName = null;
		
		do { // this is the main menu
			
			System.out.println("Choose an option below \n");
			System.out.println("1. Add a contact");
			System.out.println("2. Delete a contact ");
			System.out.println("3. Search phone number ");
			System.out.println("4. Update phone number:");
			System.out.println("5. Display the phone book in sorted order: ");
			System.out.println("6. Save and Exit:");
			
			
			
			userInput = kbd.nextInt();
			kbd.nextLine();
			switch (userInput) {
			case 1: 
				System.out.println("Add name"); // Asking users to add name 
				name = kbd.nextLine();
				System.out.println("Add a phone number"); // Asking user for phone Numebr
				phoneNumber = kbd.nextLine();
				kbd.nextLine();
				b.add(name, phoneNumber); // it adds what the user inputs the name and the phoneNumber from phoneBook
				System.out.println("Press Enter to continue");
				break;
			case 2:
				System.out.println("enter a name");
				userAnswer = kbd.nextLine();
				b.delete(userAnswer); //  it deletes from the user answer of the name from the input.txt file
				System.out.println("Press Enter to continue");
				break;
			case 3:
				System.out.println("Enter name in phoneBook");
				userAnswer = kbd.nextLine();
				if (b.search(userAnswer) == null) //if it equals to null then it prints not found
					System.out.println("name not found");
				else {
					System.out.println(b.search(userAnswer)); // it prints out the userAnswer
				}
				System.out.println("Press Enter to continue");
					break;
			case 4: 
				System.out.println("Enter full name");
				
				userAnswer = kbd.nextLine();
				b.update(userAnswer); // it updates the answer after the user inputs it.
				
					System.out.println("Enter a new phone number");
					
					
					
					break;
			
				
			case 5:
				b.display(); // this is from the phoneBook where it displays all of the people name and phone numbers
				System.out.println("Press Enter to continue");
				
				break;
			case 6: // this is to close out the program
				b.save();
				kbd.close();
				break;
	}


	} while (userInput != 6);
	}
}

